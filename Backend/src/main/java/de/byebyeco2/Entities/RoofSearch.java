package de.byebyeco2.Entities;

import javax.persistence.*;

@Entity
@Table(name="roof_searches")
public class RoofSearch  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private int size;
    private int roofType; // 0 = Flachdach, 1 = Satteldach etc.
    private int orientation; // 0 = south, 1 = southwest, 2 = west, ...
    private int roofTilt; //Neigung 0°, 15°, 30°, 45° etc.
    private boolean ownUse;
    private int kWp;


}
