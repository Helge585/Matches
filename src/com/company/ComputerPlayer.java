package com.company;

public class ComputerPlayer {
    public int getNewStepValue(int prevUserStepValue) {
        return prevUserStepValue == 0 ? 3 : 4 - prevUserStepValue;
    }
}
