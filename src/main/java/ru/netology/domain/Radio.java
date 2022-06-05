package ru.netology.domain;

public class Radio {

    private int currentStationNumber;
    private int currentSoundVolume;

    private int amountStationNumber = 10;

    private int maxSoundVolume = 100;

    private int minSoundVolume = 0;

    public Radio(int amountStationNumber) {
        this.amountStationNumber = amountStationNumber - 1;
    }

    public Radio() {

    }

    public void setCurrentStationNumber(int currentStationNumber) {

        if (currentStationNumber > amountStationNumber) {
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

        if (currentStationNumber >= amountStationNumber) {
            currentStationNumber = 0;
        } else {
            currentStationNumber = currentStationNumber + 1;

        }
        return currentStationNumber;
    }

    public int prevStation() {
        currentStationNumber = currentStationNumber - 1;
        if (currentStationNumber < 0) {
            currentStationNumber = amountStationNumber;

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
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume = currentSoundVolume + 1;

        }
        return currentSoundVolume;
    }

    public int decreaseVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        return currentSoundVolume;
    }
}
