package org.example;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        start(scanner);

    }

    public static void calHeightToFeet(double height) {
        double cm = height;
        double feet = 30.48;

        DecimalFormat decfor = new DecimalFormat("0.0");

        System.out.println("You are " + decfor.format(cm/feet) + "″ tall");

    }

    public static void start(Scanner scanner) throws InterruptedException {
        System.out.println("Do you want to convert cm or feet?");

        String answer1 = scanner.nextLine();

        if(Objects.equals(answer1, "cm") || Objects.equals(answer1, "feet")) {
            if(answer1.equals("cm")) {
                System.out.println("What is your current height in cm?");
                double answer2 = Double.parseDouble(scanner.nextLine());
                if(answer2 > 0) {
                    calHeightToFeet(answer2);
                }
            } else {
                if(answer1.equals("feet")) {
                    System.out.println("What is your current height in feet?");
                    double answer2 = Double.parseDouble(scanner.nextLine());
                    if(answer2 > 0) {
                        calHeightToCm(answer2);
                    }
                }
            }
        } else {
            System.out.println("You can only choose between cm or feet!");
            start(scanner);
        }
    }

    public static void calHeightToCm(double height) {
        double feet = height;
        double multiplier = 30.48;

        int answer = (int) (feet * multiplier);

        System.out.println("You are " + answer + "cm tall");

    }

}