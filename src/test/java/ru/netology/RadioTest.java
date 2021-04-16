package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldInitFields() {
        assertEquals("Radio", radio.getName());
        assertEquals(0, radio.getMinVolume());
        assertEquals(10, radio.getMaxVolume());
        assertEquals(0, radio.getMinStation());
        assertEquals(9, radio.getMaxStation());
        assertFalse( radio.isOn());
    }

    @Test
    public void shouldRadioOn() {
        radio.setOn(true);
        assertTrue( radio.isOn());
    }

    @Test
    public void shouldSetMaxMinVolume() {
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
        radio.setCurrentVolume(-3);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetRightNumberStation() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPlusVolume() {
        radio.setPlusVolume(true);
        radio.setCurrentVolume(5);
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldMinusVolume() {
        radio.setMinusVolume(true);
        radio.setCurrentVolume(10);
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchToNextStation() {
        radio.setNextStation(true);
        radio.setCurrentStation(9);
        assertEquals(0, radio.getCurrentStation());
        radio.setNextStation(true);
        radio.setCurrentStation(8);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToPrevStation() {
        radio.setPrevStation(true);
        radio.setCurrentStation(0);
        assertEquals(9, radio.getCurrentStation());
        radio.setPrevStation(true);
        radio.setCurrentStation(5);
        assertEquals(4, radio.getCurrentStation());
    }
}
