package com.entertainment.client;

import com.entertainment.Television;

class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television("TCL", 20);
        System.out.println(tv2);
        System.out.println(tv1);
        tv1.setVolume(12);
        tv1.setBrand("toshiba");
        System.out.println(tv1);

        Television tva = new Television("sony", 5);
        Television tvb = new Television("sony", 5);

        System.out.println("tva == tvb: " + (tva == tvb));
        System.out.println("tva.equals(tvb): " + (tva.equals(tvb)));
    }
}