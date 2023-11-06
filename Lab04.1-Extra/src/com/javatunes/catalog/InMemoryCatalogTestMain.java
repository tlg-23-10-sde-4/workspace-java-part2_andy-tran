/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;

class InMemoryCatalogTestMain {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        // testFindById();
        // testFindByKeyword();
        // testFindByCategory();
        // testSize();
         testGetAll();
        // testFindSelfEntitled();
        // testFindCheapRock();
        // testNumInGenre();
        // testGetAvgPrice();
        // testFindCheapest();
    }

    private static void testFindCheapest() {
    }

    private static void testGetAvgPrice() {
    }

    private static void testNumInGenre() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        int nums = catalog.numInGenre(MusicCategory.ROCK);
        System.out.println(nums);
    }

    private static void testFindCheapRock() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> cheap = catalog.findCheapRock(20.0);
        dump(cheap);
    }

    private static void testFindSelfEntitled() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> entitled = catalog.findSelfTitled();
        dump(entitled);
    }

    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        MusicItem found = catalog.findById(9L);
        System.out.println(found);

        MusicItem nFound = catalog.findById(25L);
        System.out.println(nFound);
    }

    private static void testFindByKeyword() {
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> pop = catalog.findByCategory(MusicCategory.POP);
        dump(pop);
    }

    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.size());
    }

    private static void testGetAll() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> allItems = catalog.getAll();
        allItems.clear(); // should throw exception
    }

    // helper method to show collection vertically
    private static void dump(Collection<MusicItem> items) {
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }
}