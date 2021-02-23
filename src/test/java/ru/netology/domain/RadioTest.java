
package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void testRadioFAIL() throws IllegalArgumentException {
        int actualChannel = 3;
        int actualSoundLevel = 5;

        Radio radio = new Radio();

        assertEquals(3, actualChannel);
        assertEquals(5, actualSoundLevel);
    }

    @Test
    void testSetNumberRadioFAIL() {
        int initialActualChannel = 10;
        String expected = "введите номер канала от 0 до 9";

        Radio radio = new Radio(initialActualChannel);
        int newActualChannal = radio.setNumberRadio(initialActualChannel);


        assertEquals(expected, newActualChannal);
    }

    @Test
    void testSetLevelSoundRadioFAIL() {
        int intitialActualLevel = 95;

        Radio radio = new Radio(intitialActualLevel);
        int newActualLevel = radio.setSoundLevel(intitialActualLevel);

        assertEquals(95, newActualLevel);
    }

    @Test
    void testNextOK9() {

        int actualChannal = 10;
        Radio radio1 = new Radio(actualChannal);
        int newActualChannal = radio1.next();

        assertEquals(0, newActualChannal);
    }

    @Test
    void testPrevOK0() {
        int actualChannal = 0;
        Radio radio1 = new Radio(actualChannal);
        int newActualChannal = radio1.prev();

        assertEquals(9, newActualChannal);
    }

    @Test
    void testPlusOK10(){
        int actualChannal = 0;
        int actualLevelSound = 100;

        Radio radio = new Radio(actualChannal, actualLevelSound);
        int newActualLevelSound = radio.plusSound();

        assertEquals(100, newActualLevelSound);
    }

    @Test
    void testMinusOK0(){
        int actualLevelSound = 0;
        Radio radio = new Radio(actualLevelSound);
        int newActualLevelSound = radio.minusSound();

        assertEquals(0, newActualLevelSound);
    }

}