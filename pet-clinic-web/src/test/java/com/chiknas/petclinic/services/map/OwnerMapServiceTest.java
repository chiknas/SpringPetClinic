package com.chiknas.petclinic.services.map;

import com.chiknas.petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * OwnerService map implementation tests.
 *
 * @author NikolaosK
 * @since 18/03/2020
 */
class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetMapService(), new PetTypeMapService());
        ownerMapService.save(Owner.builder().id(1L).lastName("kyknas").build());
    }

    @Test
    void findAll() {
        Set<Owner> all = ownerMapService.findAll();
        assertEquals(all.size(), 1);
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(1L);
        assertEquals(ownerMapService.findAll().size(), 0);
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(1L));
        assertEquals(ownerMapService.findAll().size(), 0);
    }

    @Test
    void saveExistingID() {
        Owner save = ownerMapService.save(Owner.builder().id(2L).build());
        assertEquals(2L, save.getId());
    }

    @Test
    void saveNoID() {
        Owner save = ownerMapService.save(new Owner());
        assertNotNull(save.getId());
    }

    @Test
    void findById() {
        Owner byId = ownerMapService.findById(1L);
        assertEquals(1L, byId.getId());
    }

    @Test
    void findByLastName() {
        Owner kyknas = ownerMapService.findByLastName("kyknas");
        assertNotNull(kyknas);
        assertEquals(1, kyknas.getId());
    }
}