public class Radio {

    public int currenStationNumber;

    public int getCurrenStationNumber() {
        return currenStationNumber;
    }

    public void setCurrenStationNumber(int NewCurrenStationNumber) {
        if (NewCurrenStationNumber < 0) {
            return;
        }

        if (NewCurrenStationNumber > 9) {
            return;
        }
        currenStationNumber = NewCurrenStationNumber;
    }


    public void Next() {

        if (currenStationNumber < 9) {
            currenStationNumber = currenStationNumber + 1;
        } else {
            currenStationNumber = 0;
        }
    }

    public void Previos() {

        if (currenStationNumber < 9) {
            currenStationNumber = currenStationNumber - 1;
        }

        if (currenStationNumber == 9) {
            currenStationNumber = currenStationNumber - 1;
        }

        if (currenStationNumber < 0) {
            currenStationNumber = currenStationNumber + 10;
        }
    }

    public int soundVolume;

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void setCurrentSoundVolume(int NewCurrentSoundVolume) {
        if (NewCurrentSoundVolume < 0) {
            return;
        }

        if (NewCurrentSoundVolume > 100) {
            return;
        }
        soundVolume = NewCurrentSoundVolume;
    }

    public void soundVolumeUp() {

        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;

        }

            if (soundVolume >= 100) {
                soundVolume = 100;
            }


//        } else {
//            soundVolume = 100;
//        }
    }

    public void soundVolumeBakc() {

        if (soundVolume < 100) {
            soundVolume = soundVolume - 1;
        }

        if (soundVolume == 100) {
            soundVolume = soundVolume - 1;
        }

        if (soundVolume < 0) {
            soundVolume = 0;
        }
    }
}



