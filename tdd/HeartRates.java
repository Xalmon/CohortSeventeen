package tdd;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class HeartRates {
    private String firstName;
    private String lastname;
    private LocalDate dateOfBirth;
    private class Date{}
    private class month{}
    private class year{}


    public HeartRates(String firstName, String lastname, int day, int month, int year){
        this.firstName=firstName;
        this.lastname=lastname;
        dateOfBirth=LocalDate.of(year, month, day);
    }
    public  HeartRates(){}
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String name) {
        lastname=name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setDateOfBirth(int date, int month, int year){
        dateOfBirth = LocalDate.of(year, month, date);
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
