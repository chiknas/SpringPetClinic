package com.chiknas.petclinic.services.jpa;

import com.chiknas.petclinic.model.Owner;
import com.chiknas.petclinic.repositories.OwnerRepository;
import com.chiknas.petclinic.repositories.PetRepository;
import com.chiknas.petclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * Unit tests for Jpa implementation of OwnerService
 *
 * @author NikolaosK
 * @since 18/03/2020
 */
@ExtendWith({MockitoExtension.class})
class OwnerJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerJpaService ownerService;

    Owner returnOwner;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(1L).lastName("smith").build();
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner findByLastName = ownerService.findByLastName("smith");
        assertEquals("smith", findByLastName.getLastName());
        verify(ownerRepository, times(1)).findByLastName(any());
    }

    @Test
    void findAll() {
        HashSet<Owner> results = new HashSet<>();
        results.add(Owner.builder().id(1L).build());
        results.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(results);

        Set<Owner> all = ownerService.findAll();
        assertEquals(all.size(), 2);
        verify(ownerRepository, times(1)).findAll();
    }

    @Test
    void findById() {
        when(ownerRepository.findById(any())).thenReturn(Optional.ofNullable(returnOwner));

        Owner byId = ownerService.findById(1L);

        assertNotNull(byId);
    }

    @Test
    void findNull() {
        when(ownerRepository.findById(any())).thenReturn(Optional.empty());

        Owner byId = ownerService.findById(1L);

        assertNull(byId);
    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();

        when(ownerService.save(any())).thenReturn(returnOwner);

        Owner save = ownerService.save(ownerToSave);

        assertNotNull(save);
    }

    @Test
    void delete() {
        ownerService.delete(returnOwner);

        verify(ownerRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        ownerService.deleteById(1L);

        verify(ownerRepository, times(1)).deleteById(any());
    }
}