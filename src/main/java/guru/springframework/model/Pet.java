package guru.springframework.model;

import java.time.LocalDate;

public class Pet {
    public main.java.guru.springframework.model.PetType getPetType() {
        return petType;
    }

    public void setPetType(main.java.guru.springframework.model.PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    private main.java.guru.springframework.model.PetType petType;
    private Owner owner;
    private LocalDate birthday;
}
