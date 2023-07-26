package pl.przykladowastrona.strona.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rok {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String rokSzkolny;

    // Constructors, getters, and setters (you can use your IDE to generate them)

    // Default constructor (required by JPA)
    public Rok() {
    }

    // Parameterized constructor
    public Rok(String rokSzkolny) {
        this.rokSzkolny = rokSzkolny;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRokSzkolny() {
        return rokSzkolny;
    }

    public void setRokSzkolny(String rokSzkolny) {
        this.rokSzkolny = rokSzkolny;
    }


}
