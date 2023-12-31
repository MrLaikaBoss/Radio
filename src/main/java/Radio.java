public class Radio {
    private int currentRadioStation;
    private int numberStation = 10;
    private int maxStation = 9;
    private final int minStation = 0;
    private int currentVolume;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {

        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }

    }

    public void stepBackRadioStation() {

        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}



