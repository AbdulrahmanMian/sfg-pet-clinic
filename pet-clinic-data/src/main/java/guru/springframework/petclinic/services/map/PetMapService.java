package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.CrudService;
import guru.springframework.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}