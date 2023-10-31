package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

class TelevisionClient {
    public static void main(String[] args) {
        Television tva = new Television("LG", 34);
        Television tvb = new Television("sony", 50);

        System.out.println("tva == tvb: " + (tva == tvb));
        System.out.println("tva.equals(tvb): " + (tva.equals(tvb)));
        System.out.println();

        System.out.println(tva.hashCode()); // 109622188
        System.out.println(tvb.hashCode()); // 109622188
        // if .equals is true hashcode will be the same.

        System.out.println();
        Set<Television> tvs = new HashSet<>();
        tvs.add(tva);
        tvs.add(tvb);
        System.out.println(tvs.size());
    }
}