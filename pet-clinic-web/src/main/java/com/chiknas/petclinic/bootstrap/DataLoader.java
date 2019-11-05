package com.chiknas.petclinic.bootstrap;

import com.chiknas.petclinic.model.Owner;
import com.chiknas.petclinic.model.Vet;
import com.chiknas.petclinic.services.OwnerService;
import com.chiknas.petclinic.services.VetService;
import com.chiknas.petclinic.services.map.OwnerMapService;
import com.chiknas.petclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author nkukn - created on 5/11/2019 9:41 μ.μ.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Nikos");
        owner1.setLastName("Kyknas");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Giwrgos");
        owner2.setLastName("Kyknas");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("NikosVet");
        vet1.setLastName("KyknasVet");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("GiwrgosVet");
        vet2.setLastName("KyknasVet");
        vetService.save(vet2);
    }
}
