package de.byebyeco2.Entities;

import java.nio.file.Path;
import java.util.Date;

public abstract class RentalObject {

    private int viewCounter;
    private Path picPath;
    private Date creationDate;

    private int squareMeters;
    private double longitude;
    private double latitude;
    private boolean shadowing;

    //maybe better in extra class Financing?
    private double kfwRate;
    private int totalCost;
    private int ownCapital;
    private double returnRate;
    private Date breakEven;

    public RentalObject() {
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
