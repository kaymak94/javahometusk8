package ru.netology.domain;

public class Radio {

    private int currentStationNumber;
    private int currentSoundVolume;

    public void setCurrentStationNumber(int currentStationNumber) {

        if (currentStationNumber > 9) {
            return;
        }
        if (currentStationNumber < 0) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int nextStation() {

        if (currentStationNumber > 8) {
            currentStationNumber = 0;
        } else {
            currentStationNumber = currentStationNumber + 1;

        }
        return currentStationNumber;
    }

    public int prevStation() {
        currentStationNumber = currentStationNumber - 1;
        if (currentStationNumber < 0) {
            currentStationNumber = 9;

        }
        return currentStationNumber;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {

        this.currentSoundVolume = currentSoundVolume;
    }


    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }


    public int increaseVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;

        }
        return currentSoundVolume;
    }

    public int decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        return currentSoundVolume;
    }
}
