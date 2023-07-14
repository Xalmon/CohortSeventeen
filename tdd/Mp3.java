package tdd;

public class Mp3 {
    private boolean isOn;
    private boolean isOff;
    private int volume;
    private int channel;
    private  boolean play;


    public void setIsOn(boolean isOn) {this.isOn = isOn;}

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        volume += 1;
    }

    public boolean getIsOn() {
        return true;
    }

    public boolean setIsOn() {
        return true;
    }

    public void decreaseVolume() {
        volume -= 1;
    }


    public boolean getIsOff() {
        return true;
    }

    public void setIsOff(boolean off) {
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void nextChannel() {
        channel += 1;
    }

    public void setvolume(int i) {
    }
    public void play(){
        this.play=play;
    }
    public boolean setIsPlay(){
        return true;
    }
    public boolean getIsPlay(){
        return true;
    }
}