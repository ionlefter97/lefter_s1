package com.crystal.session3;

public enum Moves {
        UP
                {
                    @Override
                    int getValue()
                    {
                        return ++value;
                    }
                },
        DOWN
                {
                    @Override
                    int getValue()
                    {
                        return --value;
                    }
                },
        LEFT, RIGHT;
        int value = 5151;
        int getValue()
        {
            return value;
        }

}
