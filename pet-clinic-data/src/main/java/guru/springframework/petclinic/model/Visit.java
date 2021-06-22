package guru.springframework.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name = "visits")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Visit extends BaseEntity {

    private LocalDate localDate;
    private String description;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
