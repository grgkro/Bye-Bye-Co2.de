package de.byebyeco2.Entities;

import javax.persistence.*;
import java.nio.file.Path;
import java.util.Date;

@Entity
@Table(name="roof_table")
public class Roof extends RentalObject{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int orientation; // 0 = south, 1 = southwest, 2 = west, ...
    private int roofTilt; //Neigung 0°, 15°, 30°, 45° etc.
    private int roofType; // 0 = Flachdach, 1 = Satteldach etc.


    public Roof() {
    }

    public Roof(int orientation, int roofTilt, int roofType) {
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
}
