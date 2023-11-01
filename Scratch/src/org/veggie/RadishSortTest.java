package org.veggie;

import java.util.ArrayList;
import java.util.List;

class RadishSortTest {
    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();

        radishes.add(new Radish("red", 2.1, 1.0, 0));
        radishes.add(new Radish("black", 1.0, 0.0, 3));
        radishes.add(new Radish("red", 2.5, 4.2, 0));
        radishes.add(new Radish("pink", 0.7, 3.2, 2));

        System.out.println("OG order");
        dump(radishes);
        System.out.println();

        System.out.println("natty order");
        radishes.sort(null);
        dump(radishes);
        System.out.println();

        System.out.println("color, via comparator");
        radishes.sort(new RadishColorComparator());
        dump(radishes);
        System.out.println();

        System.out.println("guysOnTop, via comparator");
        radishes.sort(new RadishGuysOnTopComparator());
        dump(radishes);
        System.out.println();
    }

    private static void dump(List<Radish> radishes) {
        for (Radish radish : radishes) {
            System.out.println(radish); // tostring auto called
        }
    }
}