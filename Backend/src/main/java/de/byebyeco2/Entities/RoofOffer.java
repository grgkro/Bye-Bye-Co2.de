package de.byebyeco2.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="roof_offers")
@Data  //generates getter,setter, toString etc.
public class RoofOffer {

    @Id @Setter(AccessLevel.PROTECTED)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private int size;
    private int roofType; // 0 = Flachdach, 1 = Satteldach etc.

    public RoofOffer() {
    }

    public RoofOffer(String title, int size, int roofType) {
        this.title = title;
        this.size = size;
        this.roofType = roofType;
    }
}


//maybe add later:
//    private int orientation; // 0 = south, 1 = southwest, 2 = west, ...
//    private int roofTilt; //Neigung 0°, 15°, 30°, 45° etc.
//    private boolean ownUse;
//    private int sizeHousehold;
//    private int children;
//    private int adults;
//    private String title;
//    private String description;
//    private int viewCounter;
//    private Path[] picPaths;
//    private Date creationDate;
//    private int squareMeters;
//    private double longitude;
//    private double latitude;
//    private boolean shadowing;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String company;
//    private String tel;
//    private String mobile;