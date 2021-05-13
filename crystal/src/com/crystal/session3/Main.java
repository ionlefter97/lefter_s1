package com.crystal.session3;



public class Main {
    public static void main(String[] args) {

        //============ Exercise 1 ============
        System.out.println("============ Exercise 1 ============");
        Exercise31 exercise31 = new Exercise31();
        String[] arguments = {"first", "second", "third"};
        exercise31.showArguments(arguments);
        //can't pass either a comma-separated l ist of Strings
        //exercise31.showArguments({"first", "second", "third"});

        //============ Exercise 2 ============
        System.out.println("\n\n============ Exercise 2 ============");
        System.out.println("Exercise 2 in written in Exercise32.java file!");

        //============ Exercise 3 ============
        System.out.println("\n\n============ Exercise 3 ============");
        Day day = new Day();
        for (Weekday weekday : Weekday.values()){
            day.getTypeOfDay(weekday);
        }

        //============ Exercise 4 ============
        System.out.println("\n\n============ Exercise 4 ============");
        System.out.println(ABC.ABCDE.i);
        System.out.println(ABC.ABCDE);

        //============ Exercise 5 ============
        System.out.println("\n\n============ Exercise 5 ============");
        System.out.println(Moves.LEFT.getValue() + "  it is defalult value: 5151");
        System.out.println(Moves.UP.getValue() + "  it is pre-incrmented by 1, so the value is 5152");
        System.out.println(Moves.RIGHT.getValue() + "  it is default value: 5151");
        System.out.println(Moves.DOWN.getValue() + "  it is pre-decremented by 1, so the value is 5150");

        //============ Exercise 6 ============
        System.out.println("\n\n============ Exercise 6 ============");

        BaseClass baseClass1 = new BaseClass();
        System.out.println("Result for BaseClass: " + baseClass1.getFirstMethod());

        BaseClass baseClass2 = new DerivedBaseClass();
        System.out.println("Result for DerivedBaseClass: " + baseClass2.getFirstMethod());







    }
}
