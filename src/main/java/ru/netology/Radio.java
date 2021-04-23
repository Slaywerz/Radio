package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Radio {
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;
    private final int minStation = 0;
    private int maxStation = 10;
    private int currentStation;
    private boolean on;


    // maxStationConstructor
    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public String getName() {
        return "Radio";
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;

        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentVolumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void setCurrentVolumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentStationUp() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void setCurrentStationDown() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}


