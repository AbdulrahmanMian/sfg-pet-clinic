package guru.springframework.petclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;



@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //But what we prefer to do is use box types and that is actually a recommendation of Hibernate to use
    //box types being that box types can in fact be null
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
