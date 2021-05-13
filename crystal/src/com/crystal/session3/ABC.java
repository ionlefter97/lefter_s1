package com.crystal.session3;

public enum ABC {
    ABCDE;

    int i = 1;
    {
        i++; // i = 1, after execution of this line i = 2;
    }
    {
        ++i;// i = 3
    }
    private ABC()
    {
        i = i++ + ++i; //i = 3(post-increment) + 5(pre-increment)
    }

}
