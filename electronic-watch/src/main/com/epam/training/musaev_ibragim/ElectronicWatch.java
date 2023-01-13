package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int minutes = seconds / 60;
        seconds -= minutes * 60;
        int hours = minutes / 60;
        minutes -= hours * 60;
        hours = hours >= 24 ? hours % 24 : hours;

        String hoursString = hours == 0 ? "0" : String.valueOf(hours);
        String minutesString = minutes < 10 ? "0" + minutes : String.valueOf(minutes);
        String secondsString = seconds < 10 ? "0" + seconds : String.valueOf(seconds);
        System.out.printf("%s:%s:%s\n", hoursString, minutesString, secondsString);


    }
}
