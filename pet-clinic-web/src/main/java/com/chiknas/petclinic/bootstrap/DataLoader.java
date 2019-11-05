package com.chiknas.petclinic.bootstrap;

import com.chiknas.petclinic.model.Owner;
import com.chiknas.petclinic.model.Vet;
import com.chiknas.petclinic.services.OwnerService;
import com.chiknas.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author nkukn - created on 5/11/2019 9:41 μ.μ.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Nikos");
        owner1.setLastName("Kyknas");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Giwrgos");
        owner2.setLastName("Kyknas");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("NikosVet");
        vet1.setLastName("KyknasVet");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("GiwrgosVet");
        vet2.setLastName("KyknasVet");
        vetService.save(vet2);
    }
}
