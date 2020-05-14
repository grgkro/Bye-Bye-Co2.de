package de.byebyeco2.Dtos;

public class RoofOfferDto {
    private String title;
    private int size;
    private int roofType; // 0 = Flachdach, 1 = Satteldach etc.

//    private int orientation; // 0 = south, 1 = southwest, 2 = west, ...
//    private int roofTilt; //Neigung 0°, 15°, 30°, 45° etc.


    public RoofOfferDto() {
    }

    public RoofOfferDto(String title, int size, int roofType) {
        this.title = title;
        this.size = size;
        this.roofType = roofType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRoofType() {
        return roofType;
    }

    public void setRoofType(int roofType) {
        this.roofType = roofType;
    }
}
