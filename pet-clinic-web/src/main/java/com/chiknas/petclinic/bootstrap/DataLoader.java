package com.chiknas.petclinic.bootstrap;

import com.chiknas.petclinic.model.*;
import com.chiknas.petclinic.services.OwnerService;
import com.chiknas.petclinic.services.PetTypeService;
import com.chiknas.petclinic.services.SpecialityService;
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
    private final SpecialityService specialityService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(petTypeService.findAll().size() == 0){
            loadData();
        }
    }

    private void loadData() {
        System.out.println("Loading Data...");

        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("radio stuff");
        specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("opening stuff");
        specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("tooth stuff");
        specialityService.save(dentistry);

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
        vet1.getSpecialities().add(dentistry);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("GiwrgosVet");
        vet2.setLastName("KyknasVet");
        vet2.getSpecialities().add(surgery);
        vet2.getSpecialities().add(radiology);
        vetService.save(vet2);

        System.out.println("Data Loaded Successfully!");
    }
}
