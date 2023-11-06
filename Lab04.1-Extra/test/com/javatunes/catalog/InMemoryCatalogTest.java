package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void numberInGenre_shouldReturnCorrectResult() {
        int result = catalog.numInGenre(MusicCategory.POP);
        assertEquals(4, result);
    }

    @Test
    public void findSelfTitles_shouldReturnCollection_artistSameAsTitle() {
        Collection<MusicItem> items = catalog.findSelfTitled();
        assertEquals(2, items.size());
        for(MusicItem item: items) {
            assertEquals(item.getArtist(), item.getTitle());
        }
    }

    @Test
    public void findByCategoryshouldReturnNonEmptyCollection_categoryFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        assertEquals(4, items.size());
        for (MusicItem item : items) {
            assertEquals(item.getMusicCategory(), MusicCategory.POP);
        }
    }

    @Test
    public void findByCategoryshouldReturnEmptyCollection_categoryNotFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.JAZZ);
        assertEquals(0, items.size());
    }

    @Test
    public void findById_shouldReturnMusicItem_whenIdFound() {
        MusicItem item = catalog.findById(1L);
        assertEquals(1L, item.getId().longValue());
    }
    
    @Test
    public void findById_shouldReturnNull_whenIdNotFound() {
        MusicItem item = catalog.findById(19L);
        assertNull(item);
    }
}