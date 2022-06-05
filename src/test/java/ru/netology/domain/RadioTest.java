package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {


    @ParameterizedTest
    @CsvSource({
            "6,6",
            "0,0",
            "39,39",
            "40,0",
            "-1,0",
            "100,0"

    })

    public void setCurrentStationNumberTest(int currentStationNumber, int expected) {


        Radio rad = new Radio(40);
        rad.setCurrentStationNumber(currentStationNumber);
        int actual = rad.getCurrentStationNumber();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "3,4",
            "0,1",
            "24,0",
            "23,24"


    })

    public void nextStationTest(int currentStationNumber, int expected) {


        Radio rad = new Radio(25);
        rad.setCurrentStationNumber(currentStationNumber);
        int actual = rad.nextStation();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "45,44",
            "0,55",
            "55,54"


    })

    public void prevStationTest(int currentStationNumber, int expected) {


        Radio rad = new Radio(56);
        rad.setCurrentStationNumber(currentStationNumber);
        int actual = rad.prevStation();
        Assertions.assertEquals(actual, expected);
    }


    @ParameterizedTest
    @CsvSource({
            "75,76",
            "100,100",
            "0,1",


    })
    public void increaseSoundVolume(int currentSoundVolume, int expected) {


        Radio rad = new Radio();
        rad.setCurrentSoundVolume(currentSoundVolume);
        int actual = rad.increaseVolume();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "75,74",
            "100,99",
            "0,0"


    })

    public void decreaseSoundVolume(int currentSoundVolume, int expected) {


        Radio rad = new Radio();
        rad.setCurrentSoundVolume(currentSoundVolume);
        int actual = rad.decreaseVolume();
        Assertions.assertEquals(actual, expected);
    }
}
