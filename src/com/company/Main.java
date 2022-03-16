package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ComputerPlayer computerPlayer = new ComputerPlayer();
        Reporter reporter = new Reporter();

        int matchesCount = 20;
        int prevStepValue = 0;
        int currentStepValue = 0;

        boolean isComputerStep = true;

        while (true) {
            reporter.showReportAllMatches(matchesCount, isComputerStep);
            if (matchesCount <= 1) {
                break;
            }
            prevStepValue = currentStepValue;
            if (isComputerStep) {
                currentStepValue = computerPlayer.getNewStepValue(prevStepValue);
                reporter.showReportComputerStep(currentStepValue);
            } else {
                while (true) {
                    reporter.showReportUserStep();
                    currentStepValue = scanner.nextInt();
                    if (currentStepValue >=1 && currentStepValue <= 3) {
                        break;
                    }
                    reporter.showReportErrorUserInput();
                }
            }
            matchesCount -= currentStepValue;
            isComputerStep = !isComputerStep;
        }
    }
}
