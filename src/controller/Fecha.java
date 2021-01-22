package controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int day,month,year;
    public Fecha(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public boolean isValid(){
        try{
            GregorianCalendar gc = new GregorianCalendar(this.year, this.month, this.day);
            gc.setLenient(false);
            gc.get(Calendar.DAY_OF_MONTH);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public void addOneDay(){
        this.day++;
        if(!this.isValid()){
            this.day=1;
            this.month++;
            if(!this.isValid()){
                this.month=1;
                this.year++;
            }
        }
    }
    @Override
    public String toString() {
        return this.day +"/"+ this.month +"/"+ this.year ;
    }
}
