package guru.springframework.petclinic.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@MappedSuperclass
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;


    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName=firstName;
        this.lastName=lastName;

    }
}