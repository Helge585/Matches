package com.company;

public class Reporter {
    public void showReportAllMatches(int matchesCount, boolean isComputerStep) {
        if (matchesCount > 1) {
            System.out.println("На столе осталось " + matchesCount + " спичек");
        } else {
            System.out.println("На столе осталась одна спичака. Игрок проиграл!");
        }
    }

    public void showReportComputerStep(int currentStepValue) {
        System.out.println("Количество выбранных компьютером спичек = " + currentStepValue);
    }

    public void showReportUserStep() {
        System.out.print("Ход игрока. Введите количество спичек: ");
    }

    public void showReportErrorUserInput() {
        System.out.println("Некорректное количество спичек");
    }
}
