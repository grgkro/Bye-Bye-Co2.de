package de.byebyeco2.Entities;

import javax.persistence.*;

@Entity
@Table(name="roof_offers")
public class RoofOffer extends Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int orientation; // 0 = south, 1 = southwest, 2 = west, ...
    private int roofTilt; //Neigung 0°, 15°, 30°, 45° etc.
    private int roofType; // 0 = Flachdach, 1 = Satteldach etc.
    private boolean ownUse;
    private int sizeHousehold;
    private int children;
    private int adults;

    public RoofOffer() {
    }

    public RoofOffer(int orientation, int roofTilt, int roofType) {
        this.orientation = orientation;
        this.roofTilt = roofTilt;
        this.roofType = roofType;
    }

    public Long getId() {
        return id;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public int getRoofTilt() {
        return roofTilt;
    }

    public void setRoofTilt(int roofTilt) {
        this.roofTilt = roofTilt;
    }

    public int getRoofType() {
        return roofType;
    }

    public void setRoofType(int roofType) {
        this.roofType = roofType;
    }

    public boolean isOwnUse() {
        return ownUse;
    }

    public void setOwnUse(boolean ownUse) {
        this.ownUse = ownUse;
    }

    public int getSizeHousehold() {
        return sizeHousehold;
    }

    public void setSizeHousehold(int sizeHousehold) {
        this.sizeHousehold = sizeHousehold;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }
}
