/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {

    @Test
    public void findByBrands_shouldReturnNonEmptyMap_brandsPassed() {
        Map<String, Collection<Television>> tvMap = Catalog.findByBrands("Sony", "Zenith");
        assertEquals(2, tvMap.size());
        Collection<Television> sonyTvs = tvMap.get("Sony");
        for (Television tv : sonyTvs) {
            assertEquals("Sony", tv.getBrand());
        }
        Collection<Television> zenithTvs = tvMap.get("Zenith");
        for (Television tv : zenithTvs) {
            assertEquals("Zenith", tv.getBrand());
        }
        System.out.println(tvMap);
    }

    @Test
    public void findByBrands_shouldReturnEmptyMap_whenNoBrandsPassed() {
        Map<String, Collection<Television>> tvMap = Catalog.findByBrands();
        assertTrue(tvMap.isEmpty());
    }

    @Test
    public void findByBrand_shouldReturnCollection_brandFound() {
        Collection<Television> tvs = Catalog.findByBrand("Sony");
        assertEquals(7, tvs.size());
        for(Television tv : tvs) {
            assertEquals("Sony", tv.getBrand());
        }
    }

    @Test
    public void testFindByBrandNoMatches() {
        Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
        assertTrue(tvs.isEmpty());
    }
}