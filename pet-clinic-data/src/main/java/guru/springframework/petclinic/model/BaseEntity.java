package guru.springframework.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
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
