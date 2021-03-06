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
        assertFalse(radio.isOn());
    }

    @Test
    public void shouldRadioOn() {
        radio.setOn(true);
        assertTrue(radio.isOn());
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
    public void shouldChangeVolume() {
        radio.setCurrentVolume(5);
        radio.setCurrentVolumeUp();
        assertEquals(6, radio.getCurrentVolume());
        radio.setCurrentVolumeDown();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeStation() {
        radio.setCurrentStation(7);
        radio.setCurrentStationUp();
        assertEquals(8, radio.getCurrentStation());
        radio.setCurrentStationDown();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldNotChangeVolumeUp() {
        radio.setCurrentVolume(10);
        radio.setCurrentVolumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeVolumeDown() {
        radio.setCurrentVolume(0);
        radio.setCurrentVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeBorderStation() {
        radio.setCurrentStation(9);
        radio.setCurrentStationUp();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStationDown();
        assertEquals(9, radio.getCurrentStation());
    }
}
