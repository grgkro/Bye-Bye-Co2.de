package de.byebyeco2.Entities;

import javax.persistence.*;

@Entity
@Table(name="openArea_searches")
public class OpenAreaOffer extends Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

}
