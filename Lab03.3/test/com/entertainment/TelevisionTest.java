package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television tv;

    @Before
    public void setUp() {
        tv = new Television();
    }

    @Test
    public void testHashCode() {
        assertEquals(29791, tv.hashCode());
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_upperBound() throws InvalidChannelException {
        tv.changeChannel(1000);
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_lowerBound() throws InvalidChannelException {
        tv.changeChannel(0);
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_upperBound() throws InvalidChannelException {
        tv.changeChannel(999);
        assertEquals(999, tv.getCurrentChannel());
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_lowerBound() throws InvalidChannelException {
        tv.changeChannel(1);
        assertEquals(1, tv.getCurrentChannel());
    }

    @Test
    public void setVolume_shouldThrowIllegalArgumentExceptionInvalidUpperBound() {
        try {
            tv.setVolume(101); // should trigger exception
            fail("should have thrown illegal argument exception");
        } catch (IllegalArgumentException e) {
            String expected = "Invalid volume: 101. Allowed range: [0,100].";
            assertEquals(expected, e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentExceptionInvalidLowerBound() {
        tv.setVolume(-1);
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_upperBound() {
        tv.setVolume(100);
        assertEquals(100, tv.getVolume());
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_lowerBound() {
        tv.setVolume(0);
        assertEquals(0, tv.getVolume());
    }
}