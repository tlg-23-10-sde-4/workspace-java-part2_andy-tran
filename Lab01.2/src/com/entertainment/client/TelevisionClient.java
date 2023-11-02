package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class TelevisionClient {
    public static void main(String[] args) {
        Television tva = new Television("sony", 50);
        Television tvb = new Television("sony", 50);
        Television tvc = new Television("sony", 52);
        Television tvd = new Television("sony", 12);

        System.out.println("tva == tvb: " + (tva == tvb));
        System.out.println("tva.equals(tvb): " + (tva.equals(tvb)));
        System.out.println();

        //System.out.println(tva.hashCode()); // 109622188
        //System.out.println(tvb.hashCode()); // 109622188
        // if .equals is true hashcode will be the same.

        System.out.println();
        Set<Television> tvs = new TreeSet<>();

        tvs.add(tva);
        tvs.add(tvb);
        tvs.add(tvc);
        tvs.add(tvd);

        System.out.println(tvs.size());
        for (Television tv : tvs) {
            System.out.println(tv);
        }
    }
}