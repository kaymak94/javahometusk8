package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "6,6",
            "0,0",
            "9,9",
            "10,0",
            "-1,0",
            "100,0"

    })

    public void setCurrentStationNumberTest(int currentStationNumber, int expected) {


        Radio rad = new Radio();
        rad.setCurrentStationNumber(currentStationNumber);
        int actual = rad.getCurrentStationNumber();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "6,7",
            "0,1",
            "9,0"


    })

    public void nextStationTest(int currentStationNumber, int expected) {


        Radio rad = new Radio();
        rad.setCurrentStationNumber(currentStationNumber);
        int actual = rad.nextStation();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "4,3",
            "9,8",
            "0,9"


    })

    public void pevStationTest(int currentStationNumber, int expected) {


        Radio rad = new Radio();
        rad.setCurrentStationNumber(currentStationNumber);
        int actual = rad.prevStation();
        Assertions.assertEquals(actual, expected);
    }


    @ParameterizedTest
    @CsvSource({
            "5,6",
            "10,10",
            "0,1"


    })
    public void increaseSoundVolume(int currentSoundVolume, int expected) {


        Radio rad = new Radio();
        rad.setCurrentSoundVolume(currentSoundVolume);
        int actual = rad.increaseVolume();
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "5,4",
            "10,9",
            "0,0"


    })

    public void decreaseSoundVolume(int currentSoundVolume, int expected) {


        Radio rad = new Radio();
        rad.setCurrentSoundVolume(currentSoundVolume);
        int actual = rad.decreaseVolume();
        Assertions.assertEquals(actual, expected);
    }
}
