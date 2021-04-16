package ru.netology;

public class Radio {
    private final int minVolume = 0;
    private final int maxVolume = 10;
    private int currentVolume;
    private boolean plusVolume;
    private boolean minusVolume;
    private final int minStation = 0;
    private final int maxStation = 9;
    private int currentStation;
    private boolean prevStation;
    private boolean nextStation;
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

    public void setPlusVolume(boolean plusVolume) {
        this.plusVolume = plusVolume;
    }

    public void setMinusVolume(boolean minusVolume) {
        this.minusVolume = minusVolume;
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
        if (plusVolume) {
            currentVolume++;
        }
        if (minusVolume) {
            currentVolume--;
        }

        this.currentVolume = currentVolume;
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

    public void setPrevStation(boolean prevStation) {
        this.prevStation = prevStation;
    }

    public void setNextStation(boolean nextStation) {
        this.nextStation = nextStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }

        if (nextStation) {
            currentStation++;
            if (currentStation > maxStation) {
                currentStation = minStation;
            }
        }
        if (prevStation) {
            currentStation--;
            if (currentStation < minStation) {
                currentStation = maxStation;
            }
        }
        this.currentStation = currentStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}


