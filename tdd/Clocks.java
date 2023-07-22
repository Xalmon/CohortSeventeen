package tdd;


public class Clocks {
    private int minutes;
    private int seconds;
    private  int hours;
    private int year;
    public void convertMinutesToSeconds(){
        seconds = minutes * 60;
}

    public void setMinutes(int minutes) {
        if (minutes > 0) {
            this.minutes = minutes;
        } else if (minutes < 0) {
            return;
        }
    }


    public int getSeconds() {
        return  seconds;
    }
    public void convertHoursToMinutes() {
        minutes = hours * 60;
    }
    public void setHours(int hours) {
        if (hours > 0) {this.hours = hours;
    } else if (minutes < 0) {
            return;
        }
    }
    public  int getMinutes() {
        return  minutes;
    }
    public void convertYearToMinutes() {
        year = year / (365 * 24 * 60);
    }
    public void setYear(int year) {
        if (year > 0) {this.year = year;
    } else if (year > 0) {
            return;
        }
    }
    public int getYear() {
        return year;
    }

    public void convertMinutesToYear() {
        year = minutes / (365 * 24 * 60);
    }
}
