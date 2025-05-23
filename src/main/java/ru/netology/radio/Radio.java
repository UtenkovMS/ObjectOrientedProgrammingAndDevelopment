package ru.netology.radio;

public class Radio {

    private int currenStationNumber;
    private int soundVolume;

    public int getCurrenStationNumber() {
        return currenStationNumber;
    }

    public void setCurrenStationNumber(int newCurrenStationNumber) {
        if (newCurrenStationNumber < 0) {
            return;
        }

        if (newCurrenStationNumber > 9) {
            return;
        }
        currenStationNumber = newCurrenStationNumber;
    }

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }

        if (newCurrentSoundVolume > 100) {
            return;
        }
        soundVolume = newCurrentSoundVolume;
    }

    public void next() {

        if (currenStationNumber < 9) {
            currenStationNumber = currenStationNumber + 1;
        } else {
            currenStationNumber = 0;
        }
    }

    public void prev() {

        if (currenStationNumber <= 9) {
            currenStationNumber = currenStationNumber - 1;
        }

        if (currenStationNumber < 0) {
            currenStationNumber = currenStationNumber + 10;
        }
    }

    public void soundVolumeUp() {

        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }

        if (soundVolume >= 100) {
            soundVolume = 100;
        }
    }

    public void soundVolumeBakc() {

        if (soundVolume <= 100) {
            soundVolume = soundVolume - 1;
        }

        if (soundVolume < 0) {
            soundVolume = 0;
        }
    }
}



