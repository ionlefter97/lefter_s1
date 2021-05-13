package com.crystal.session3;

public class DerivedBaseClass extends BaseClass{
int i = 0;

    @Override
    public int getSecondMethod() {
        i = 22;
        return i;
    }
}
