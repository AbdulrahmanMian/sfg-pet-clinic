package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.OwnerService;
import guru.springframework.petclinic.services.VetService;
import guru.springframework.petclinic.services.map.OwnerServiceMap;
import guru.springframework.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//And by Component, by making this a Component, this becomes a Spring Bean and it gets registered into
//the Spring Context. What happens underneath the covers of Spring is this is going to execute.
//Spring saves that, "Oh, this implements CommandLineRunner." When my Spring Context is completely up and
//ready, it's going to call this run method and run everything inside of it.
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService=new OwnerServiceMap();
        vetService=new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1= new Owner();
        owner1.setId(1L);
        owner1.setFirstname("FirstnameOwner");
        owner1.setLastname("LastnameOwner");

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setId(2L);
        owner2.setFirstname("FirstnameOwner-2");
        owner2.setLastname("LastnameOwner-2");

        ownerService.save(owner2);

        System.out.println("Loaded the Owners....");

        Vet vet1= new Vet();
        vet1.setId(1L);
        vet1.setFirstname("FirstnameVet");
        vet1.setLastname("LastnameVet");

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFirstname("FirstnameVet-2");
        vet2.setLastname("LastnameVet-2");

        vetService.save(vet2);

        System.out.println("Loaded the Vets....!");
    }
}
