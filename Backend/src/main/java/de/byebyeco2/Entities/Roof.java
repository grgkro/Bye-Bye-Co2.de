package de.byebyeco2.Entities;

import javax.persistence.*;
import java.nio.file.Path;
import java.util.Date;

@Entity
@Table(name="roof_table")
public class Roof {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Owner owner;
    private Renter renter;
    private int viewCounter;
    private Path picPath;
    private Date creationDate;

    private int squareMeters;
    private int orientation; // 0 = south, 1 = southwest, 2 = west, ...
    private int roofTilt; //Neigung 0°, 15°, 30°, 45° etc.
    private int roofType; // 0 = Flachdach, 1 = Satteldach etc.
    private double longitude;
    private double latitude;
    private boolean shadowing;
    private double kfwRate;
    private int totalCost;
    private int ownCapital;
    private double returnRate;
    private Date breakEven;

    public Roof() {
    }

    public Long getId() {
        return id;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public int getViewCounter() {
        return viewCounter;
    }

    public void setViewCounter(int viewCounter) {
        this.viewCounter = viewCounter;
    }

    public Path getPicPath() {
        return picPath;
    }

    public void setPicPath(Path picPath) {
        this.picPath = picPath;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
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

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public boolean isShadowing() {
        return shadowing;
    }

    public void setShadowing(boolean shadowing) {
        this.shadowing = shadowing;
    }

    public double getKfwRate() {
        return kfwRate;
    }

    public void setKfwRate(double kfwRate) {
        this.kfwRate = kfwRate;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getOwnCapital() {
        return ownCapital;
    }

    public void setOwnCapital(int ownCapital) {
        this.ownCapital = ownCapital;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

    public Date getBreakEven() {
        return breakEven;
    }

    public void setBreakEven(Date breakEven) {
        this.breakEven = breakEven;
    }
}
