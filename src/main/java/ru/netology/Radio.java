package ru.netology;

public class Radio {
    private String name = "Radio";
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;
    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int currentNumberStation;

    public String getName() {
        return name;
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
        int volumePlus = currentVolume + 1;
        int volumeMinus = currentVolume - 1;
        if (volumePlus > maxVolume) {
            return;
        }
        if (volumeMinus < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }


    public int getMaxNumberStation() {
        return maxNumberStation;
    }


    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int setCurrentNumberStation(int currentNumberStation) {
        int next = currentNumberStation + 1;
        int prev = currentNumberStation - 1;
        if (next > maxNumberStation){
            return minNumberStation;
        }
        if (prev < minNumberStation){
            return maxNumberStation;
        }
        return this.currentNumberStation = currentNumberStation;
    }

    private boolean on;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}


