package com.chiknas.petclinic.bootstrap;

import com.chiknas.petclinic.model.Owner;
import com.chiknas.petclinic.model.Pet;
import com.chiknas.petclinic.model.PetType;
import com.chiknas.petclinic.model.Vet;
import com.chiknas.petclinic.services.OwnerService;
import com.chiknas.petclinic.services.PetTypeService;
import com.chiknas.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author nkukn - created on 5/11/2019 9:41 μ.μ.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Nikos");
        owner1.setLastName("Kyknas");
        owner1.setAddress("spileou");
        owner1.setCity("zefurara");
        owner1.setTelephone("090654789");

        Pet nikosPet = new Pet();
        nikosPet.setOwner(owner1);
        nikosPet.setName("nikos pet");
        nikosPet.setBirthDate(LocalDate.now());
        nikosPet.setPetType(dog);
        owner1.getPets().add(nikosPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Giwrgos");
        owner2.setLastName("Kyknas");
        owner2.setAddress("megalou");
        owner2.setCity("athina");
        owner2.setTelephone("09789456");

        Pet giwrgosPet = new Pet();
        giwrgosPet.setPetType(cat);
        giwrgosPet.setName("giwrgos pet");
        giwrgosPet.setBirthDate(LocalDate.now());
        giwrgosPet.setOwner(owner2);
        owner2.getPets().add(giwrgosPet);

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
