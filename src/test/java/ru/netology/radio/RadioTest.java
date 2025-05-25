package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void currentStation() {

        Radio radio = new Radio();
        radio.setCurrenStationNumber(7); // изменяет номер станции радио

        int expected = 7; // ожидаемый результат
        int actual = radio.getCurrenStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущий номер станции " + radio.getCurrenStationNumber() + " FM");
    }

    @Test
    public void currentStation1() {

        Radio radio = new Radio();
        radio.setCurrenStationNumber(10); // изменяет номер станции радио

        int expected = 0; // ожидаемый результат
        int actual = radio.getCurrenStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущий номер станции " + radio.getCurrenStationNumber() + " FM");
    }

    @Test
    public void currentStation2() {

        Radio radio = new Radio();
        radio.setCurrenStationNumber(-1); // изменяет номер станции радио

        int expected = 0; // ожидаемый результат
        int actual = radio.getCurrenStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущий номер станции " + radio.getCurrenStationNumber() + " FM");
    }

    @Test
    public void nextNomberRadio() {
        Radio radio = new Radio();
        radio.setCurrenStationNumber(7);
        radio.next();

        int expected = 8; // ожидаемый результат
        int actual = radio.getCurrenStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println("Номер станции с шагом вперед " + radio.getCurrenStationNumber() + " FM");
    }

    @Test
    public void nextNomberRadio1() {
        Radio radio = new Radio();
        radio.setCurrenStationNumber(9);
        radio.next();

        int expected = 0; // ожидаемый результат
        int actual = radio.getCurrenStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println("Номер станции с шагом вперед " + radio.getCurrenStationNumber() + " FM");
    }

    @Test
    public void backNomberRadio() {
        Radio radio = new Radio();
        radio.setCurrenStationNumber(7);
        radio.prev();

        int expected = 6; // ожидаемый результат
        int actual = radio.getCurrenStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println("Номер станции с шагом назад " + radio.getCurrenStationNumber() + " FM");
    }

    @Test
    public void backNomberRadio1() {
        Radio radio = new Radio();
        radio.setCurrenStationNumber(0);
        radio.prev();

        int expected = 9; // ожидаемый результат
        int actual = radio.getCurrenStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println("Номер станции с шагом назад " + radio.getCurrenStationNumber() + " FM");
    }

    @Test
    public void backNomberRadio2() {
        Radio radio = new Radio();
        radio.setCurrenStationNumber(-1);
        radio.prev();

        int expected = 9; // ожидаемый результат
        int actual = radio.getCurrenStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println("Номер станции с шагом назад " + radio.getCurrenStationNumber() + " FM");
    }

    @Test
    public void backNomberRadio3() {
        Radio radio = new Radio();
        radio.setCurrenStationNumber(9);
        radio.prev();

        int expected = 8; // ожидаемый результат
        int actual = radio.getCurrenStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println("Номер станции с шагом назад " + radio.getCurrenStationNumber() + " FM");
    }

    @Test
    public void currentSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(50);

        int expected = 50; // ожидаемый результат
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущая шкала громкости: " + radio.getCurrentSoundVolume());
    }

    @Test
    public void currentSoundVolume1() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(101);

        int expected = 0; // ожидаемый результат
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущая шкала громкости: " + radio.getCurrentSoundVolume());
    }

    @Test
    public void currentSoundVolume2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-1);

        int expected = 0; // ожидаемый результат
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущая шкала громкости: " + radio.getCurrentSoundVolume());
    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(50);
        radio.soundVolumeUp();

        int expected = 51; // ожидаемый результат
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Шкала громкости увеличенная на шаг: " + radio.getCurrentSoundVolume());
    }

    @Test
    public void volumeUp1() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.soundVolumeUp();

        int expected = 100; // ожидаемый результат
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Шкала громкости увеличенная на шаг: " + radio.getCurrentSoundVolume());
    }

    @Test
    public void volumeBack() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(50);
        radio.soundVolumeBakc();

        int expected = 49; // ожидаемый результат
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Шкала громкости уменьшена на шаг: " + radio.getCurrentSoundVolume());
    }

    @Test
    public void volumeBack1() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-1);
        radio.soundVolumeBakc();

        int expected = 0; // ожидаемый результат
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Шкала громкости уменьшена на шаг: " + radio.getCurrentSoundVolume());
    }

    @Test
    public void volumeBack2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.soundVolumeBakc();

        int expected = 99; // ожидаемый результат
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Шкала громкости уменьшена на шаг: " + radio.getCurrentSoundVolume());
    }

    @Test
    public void volumeBack3() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.soundVolumeBakc();

        int expected = 0; // ожидаемый результат
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Шкала громкости уменьшена на шаг: " + radio.getCurrentSoundVolume());
    }
}
