package com.entertainment;

import java.util.Comparator;

public class TelevisionBrandChannelComparator implements Comparator<Television> {
    @Override
    public int compare(Television tv1, Television tv2) {
        int res = tv1.getBrand().compareTo(tv2.getBrand());
        if(res == 0) {
            res = Integer.compare(tv1.getCurrentChannel(), tv2.getCurrentChannel());
        }
        return res;
    }
}