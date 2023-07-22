package tdd;

public class Car {

    int position;
    private boolean isEnginerunning;
    public void start() {
        isEnginerunning = !isEnginerunning;
    }

    public boolean isCarOn() {
        return true;
    }
    public void  accelerate (int toPosition){
        if(isEnginerunning)
        {
            position=position+toPosition;
        }
    }
    public int toPosition(){
        return position;
    }

    public boolean getPosition() {
        return false;
    }
}
