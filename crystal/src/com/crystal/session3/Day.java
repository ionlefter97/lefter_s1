package com.crystal.session3;

public class Day {
    Weekday weekday;

    public Day(){
    }

    public Day(Weekday weekday){
        this.weekday = weekday;
    }

    public boolean isWeekEnd(){
        switch (weekday){
            case SATURDAY:
                return true;
            case SUNDAY:
                return true;
            default:
                return false;
        }
    }
    public boolean isHoliDay(){
        switch (weekday){
            case MONDAY:
                return true;
            case TUESDAY:
                return true;
            case WEDNESDAY:
                return true;
            case THURSDAY:
                return true;
            case FRIDAY:
                return true;
            default:
                return false;
        }
    }

    public void getTypeOfDay(Weekday weekday){
        Day day = new Day(weekday);
        if (day.isHoliDay())
            System.out.println(weekday + " is holiday!");
        if (day.isWeekEnd())
            System.out.println(weekday + " is weekend!");

    }
}
