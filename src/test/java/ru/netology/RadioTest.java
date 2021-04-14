package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
@Test
public void shouldGetName() {

    String expected = "Radio";
    radio.getName();
    assertEquals(expected, radio.getName());
}

@Test
public void shouldGetMinVolume(){
    int expected = 0;
    radio.getMinVolume();
    assertEquals(expected, radio.getMinVolume());
}
@Test
    public void shouldGetMaxVolume(){
    int expected = 10;
    radio.getMaxVolume();
    assertEquals(expected, radio.getMaxVolume());
}
//@Test
//    public void shouldGetAndSetMaxVolume(){
//    radio.setCurrentVolume(10);
//    assertEquals(10, radio.getCurrentVolume());
//}
}