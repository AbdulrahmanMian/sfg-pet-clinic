package guru.springframework.petclinic.services;


import guru.springframework.petclinic.model.Visit;
import org.springframework.stereotype.Service;

@Service
public interface VisitService extends CrudService<Visit, Long> {
}
