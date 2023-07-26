package pl.przykladowastrona.strona.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ROK_SZKOLNY")
public class Rok {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "ROK_SZKOLNY")
    private String rokSzkolny;

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
