package de.byebyeco2.Entities;

import javax.persistence.*;

@Entity
@Table(name="openArea_searches")
public class OpenAreaSearch extends Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int kWp;

    public Long getId() {
        return id;
    }

    public int getkWp() {
        return kWp;
    }

    public void setkWp(int kWp) {
        this.kWp = kWp;
    }
}
