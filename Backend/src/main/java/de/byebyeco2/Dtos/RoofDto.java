package de.byebyeco2.Dtos;

public class RoofDto {
    private int orientation; // 0 = south, 1 = southwest, 2 = west, ...
    private int roofTilt; //Neigung 0°, 15°, 30°, 45° etc.
    private int roofType; // 0 = Flachdach, 1 = Satteldach etc.

    public RoofDto(int orientation, int roofTilt, int roofType) {
        this.orientation = orientation;
        this.roofTilt = roofTilt;
        this.roofType = roofType;
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
