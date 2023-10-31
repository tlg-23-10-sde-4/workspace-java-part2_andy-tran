package com.entertainment;

public class Television {
    private String brand;
    private int volume;
    private Tuner tuner = new Tuner();

    public Television () {
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

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " brand=" + getBrand() +
                ", volume=" + getVolume();
    }
}