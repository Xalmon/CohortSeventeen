package tdd;

public class Bike {
    private boolean status;
    private int speed;
    public void isOn() {
        status = true;
    }

    public boolean turnOn() {
        return status;
    }

    public void isOff() {
        status = false;
    }

    public void acceleration() {
        if (speed < 20) {
            speed = speed + 1;
        } else if (speed <= 31) {
            speed = speed + 2;
        } else if (speed <= 41) {
            speed = speed +3;
        } else speed = speed + 4;
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate() {
        if (speed > 41){
            speed = speed - 4;
        }else if (speed > 31 ){
            speed = speed -3;
        } else if (speed > 21) {
            speed = speed - 2;
        }else speed = speed -1;
    }

    public String gearType(){
        if (speed < 20) {
            return "gear 1";
        } else if (speed <= 31) {
            return "gear 2";
        } else if (speed <= 41) {
            return "gear 3";
        } else
            return "gear 4";
    }
}