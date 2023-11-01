package com.entertainment;

import java.util.Objects;

public class Television {
    private String brand;
    private int volume;
    private Tuner tuner = new Tuner();

    public Television() {
        // no op
    }

    public Television(String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    // business methods
    public int getCurrentChannel() {
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    // getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || this.getClass() != obj.getClass()) return false;
//        Television that = (Television) obj;
//        return this.getVolume() == that.getVolume()
//                && Objects.equals(getBrand(), that.getBrand());
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getBrand(), getVolume());
//    }

        @Override
    public int hashCode() {
        // poorly written hash func, instead use objects.hash
        //return getBrand().length() + getVolume(); //poorly written hash func
        return Objects.hash(getBrand(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = false;
        if (obj != null && this.getClass() == obj.getClass()) { // proceed only if obj is a tv object
            Television other = (Television) obj; // downcast obj to television
            res = Objects.equals(this.getBrand(), other.getBrand()) && // null safe check
                    this.getVolume() == other.getVolume(); // primitives cant be null
        }
        return res;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " brand=" + getBrand() +
                ", volume=" + getVolume();
    }
}