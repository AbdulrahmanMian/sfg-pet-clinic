package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.*;
import guru.springframework.petclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
//And by Component, by making this a Component, this becomes a Spring Bean and it gets registered into
//the Spring Context. What happens underneath the covers of Spring is this is going to execute.
//Spring saves that, "Oh, this implements CommandLineRunner." When my Spring Context is completely up and
//ready, it's going to call this run method and run everything inside of it.
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesService;
    private final VisitService  visitService;
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialitiesService specialitiesService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
        this.visitService = visitService;
    }


    @Override
    public void run(String... args) throws Exception {
            int count=petTypeService.findAll().size();
            if(count==0){
                DataLoader();
            }


    }

    private void DataLoader() {
        PetType dog =new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat =new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology= specialitiesService.save(radiology);

        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");
        Speciality savedDentistry= specialitiesService.save(dentistry);

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality savedSurgery= specialitiesService.save(surgery);


        Owner owner1= new Owner();
        owner1.setFirstName("Mike-1");
        owner1.setLastName("LastnameOwner");
        owner1.setAddress("Adress-1");
        owner1.setCity("City1");
        owner1.setTelephone("012345678");


        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthday(LocalDate.now());
        mikesPet.setName("Mike's pet");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Fiona-2");
        owner2.setLastName("LastnameOwner-2");
        owner2.setAddress("Adress-2");
        owner2.setCity("City2");
        owner2.setTelephone("98765432");


        Pet fionascat =new Pet();
        fionascat.setName("Fiona's pet");
        fionascat.setOwner(owner2);
        fionascat.setBirthday(LocalDate.now());
        fionascat.setPetType(savedCatPetType);
        owner2.getPets().add(fionascat);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(fionascat);
        catVisit.setLocalDate(LocalDate.now());
        catVisit.setDescription("sneezy cat");

        visitService.save(catVisit);

        System.out.println("Loaded the Owners....");

        Vet vet1= new Vet(1L,"FirstnameVet", "LastnameVet");
        //vet1.setFirstName("FirstnameVet");
        //vet1.setLastName("LastnameVet");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2= new Vet(2L, "FirstnameVet-2","LastnameVet-2");
        //vet2.setFirstName("FirstnameVet-2");
        //vet2.setLastName("LastnameVet-2");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded the Vets....!");
    }
}
