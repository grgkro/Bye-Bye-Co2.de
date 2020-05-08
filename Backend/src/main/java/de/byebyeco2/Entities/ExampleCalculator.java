package de.byebyeco2.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.nio.file.Path;
import java.util.Date;

@Entity
public class ExampleCalculator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Roof roof;

    public ExampleCalculator(Roof roof) {
        this.roof = roof;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }
}
