package com.crystal.session3;

public class BaseClass {
    int i = 0;
    public int getFirstMethod(){
        i = getSecondMethod();
        return i;

    }
    public int getSecondMethod(){
        i = 12;
        return i;
    }
}
