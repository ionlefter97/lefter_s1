package com.crystal;

public class DateClass {
    public String getTime(int numberOfSeconds){
        String time = null;

        if(numberOfSeconds >= 0) {
            int hours = numberOfSeconds / 3600;
            int minutes = (numberOfSeconds - (hours * 3600)) / 60;
            int seconds = (numberOfSeconds - (hours * 3600)) % 60;

            time = numberOfSeconds + " seconds are " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds";
        }else {
            time = "Please write a value greater or equal with 0";
        }
        return time;
    }
}
