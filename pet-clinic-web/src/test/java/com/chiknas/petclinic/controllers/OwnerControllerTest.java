package com.chiknas.petclinic.controllers;

import com.chiknas.petclinic.model.Owner;
import com.chiknas.petclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * OwnerController unit tests.
 *
 * @author NikolaosK
 * @since 18/03/2020
 */
@ExtendWith(SpringExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController ownerController;

    MockMvc mvc;

    Set<Owner> owners;

    @BeforeEach
    void setUp() {
        owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).build());
        owners.add(Owner.builder().id(2L).build());

        mvc = MockMvcBuilders.standaloneSetup(ownerController).build();
    }

    @Test
    void listOwners() throws Exception {
        when(ownerService.findAll()).thenReturn(owners);

        mvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET, "/owners"))
                .andExpect(view().name("owners/index"))
                .andExpect(model().attribute("owners", hasSize(2)))
                .andExpect(status().isOk());
    }

    @Test
    void findOwners() throws Exception {
        mvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET, "/owners/find"))
                .andExpect(view().name("error"))
                .andExpect(status().isOk());

        verifyNoInteractions(ownerService);
    }
}