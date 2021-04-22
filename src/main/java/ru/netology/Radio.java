package ru.netology;

public class Radio {
    private final int minVolume = 0;
    private final int maxVolume = 10;
    private int currentVolume;
    private final int minStation = 0;
    private final int maxStation = 9;
    private int currentStation;
    private boolean on;


    public String getName() {
        return "Radio";
    }


    public int getMinVolume() {
        return minVolume;
    }


    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
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

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}


