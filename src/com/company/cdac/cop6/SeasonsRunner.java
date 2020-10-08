package com.company.cdac.cop6;

import java.time.LocalDate;
import java.util.Scanner;

public class SeasonsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seasons seasons = new Seasons();

        System.out.println("Enter month (1-12) and day (1-31)");
        System.out.println("Season: " + seasons.season(scanner.nextInt(), scanner.nextInt()));

        scanner.close();
    }
}
