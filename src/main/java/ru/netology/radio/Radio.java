package ru.netology.radio;

public class Radio {

    private int currenStationNumber; // текущий номер станции
    private int stationRange = 10; // диапазон станций от 0 до 9
    private int maxStationRadio; // максимальный номер станции
    private int minStationRadio = 0; // минимальный номер станции
    private int currenSoundVolume; // громкость звука
    private int maxVolumeSound = 100; // максимальная громкость звука
    private int minVolumeSound = 0; // минимальная громкость звука

    public Radio() {
        maxStationRadio = stationRange - 1; // конструктор, который вычисляет максимальный номер станции
    }

    public Radio(int stationRange) { // конструктор, который позволяет через параметр менять в тесте диапазон станций
        this.stationRange = stationRange; // заменяет параметр диапазона станций по умолчанию, на параметр указанный в тесте
        maxStationRadio = stationRange - 1; // необходимо указать рассчет максимального номера станции, иначе расчет будет выполняться от диапазона станций по умолчанию
    }

    public int getStationRange() { // геттер для отражения в тесте диапазона станций по умолчанию
        return stationRange;
    }

    public int getCurrenStationNumber() {
        return currenStationNumber;
    }

    public void setCurrenStationNumber(int newCurrenStationNumber) {
        if (newCurrenStationNumber < minStationRadio) {
            return;
        }

        if (newCurrenStationNumber > maxStationRadio) {
            return;
        }
        currenStationNumber = newCurrenStationNumber;
    }

    public int getCurrentSoundVolume() {
        return currenSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < minVolumeSound) {
            return;
        }

        if (newCurrentSoundVolume > maxVolumeSound) {
            return;
        }
        currenSoundVolume = newCurrentSoundVolume;
    }

    public void next() { // кнопка повышения номера станции на 1 станцию

        currenStationNumber = currenStationNumber + 1; // текующая станция = текущая станция +1

        if (currenStationNumber > maxStationRadio) { // если номер текущей станции больше максимального
            currenStationNumber = minStationRadio; // то он переключается на номер минимальной станции
        }
    }

    public void prev() { // кнопка понижения номера станции на 1 станцию

        currenStationNumber = currenStationNumber - 1; // текующая станция = текущая станция -1

        if (currenStationNumber < minStationRadio) { // если номер текущей станции меньше минимального
            currenStationNumber = maxStationRadio; // то он переключается на номер максимальной станции
        }
    }

    public void soundVolumeUp() { // кнопка повышения громкости на 1 шкалу

        currenSoundVolume = currenSoundVolume + 1; // текующая громкость = текущая громкость +1

        if (currenSoundVolume > maxVolumeSound) { // если текущая громкость больше максимальной громкости
            currenSoundVolume = maxVolumeSound; // то она равна максимальной громкости
        }
    }

    public void soundVolumeBakc() { // кнопка понижения громкости на 1 шкалу

        currenSoundVolume = currenSoundVolume - 1; // текующая громкость = текущая громкость -1

        if (currenSoundVolume < minVolumeSound) { // если текущая громкость меньше минимальной громкости
            currenSoundVolume = minVolumeSound; // то она равна минимальной громкости
        }
    }
}



