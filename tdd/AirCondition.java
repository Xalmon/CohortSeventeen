package tdd;

public class AirCondition {

    private String name;
    private boolean isOn;
    private int temperature;

    public void setName(String South){
        South = name;
    }

    public String getName() {
        return name;
    }
        public boolean getIsOn() {
        return isOn;
    }
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setTemperature(int temperature) {
       this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature(int temperature) {

        temperature = temperature + 1;
   }

    public void increaseTemperature() {
        if (temperature >= 30) temperature = 30;
        else temperature = temperature + 1;
    }

    public void decreaseTemperature() {
        if (temperature <= 16) temperature = 16;
        else temperature = temperature - 1;

    }
}