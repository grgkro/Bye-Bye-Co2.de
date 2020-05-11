package de.byebyeco2.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="roof_offers")
@Getter @Setter @NoArgsConstructor @ToString
public class RoofOffer extends Listing {

    @Id @Setter(AccessLevel.PROTECTED)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int orientation; // 0 = south, 1 = southwest, 2 = west, ...
    private int roofTilt; //Neigung 0°, 15°, 30°, 45° etc.
    private int roofType; // 0 = Flachdach, 1 = Satteldach etc.
    private boolean ownUse;
    private int sizeHousehold;
    private int children;
    private int adults;

    public RoofOffer(int orientation, int roofTilt, int roofType) {
        this.orientation = orientation;
        this.roofTilt = roofTilt;
        this.roofType = roofType;
    }
}
