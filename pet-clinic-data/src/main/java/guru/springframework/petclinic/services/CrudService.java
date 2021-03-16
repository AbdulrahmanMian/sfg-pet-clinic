package guru.springframework.petclinic.services;

import java.util.Set;

public interface CrudService <T, ID>{

    //The CrudService is mimicking the Spring Data Repositories with our CrudService and
    // this implements the methods that we want to be implementing for our CrudService
        Set<T> findAll();
        T findById(ID id);
        T save(T object);
        void delete (T object);
        void deleteById(ID id);

}
