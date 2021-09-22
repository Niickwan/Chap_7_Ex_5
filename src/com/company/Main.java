package com.company;

import java.util.Scanner;

public class Main {

    public static boolean areFactors(int n, int[] numArr) {
        for (int j : numArr) {
            if (j % n != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Check if your numbers can be divided by a given number");
        System.out.print("How many numbers do you want to check?: ");
        int numInArray = scanner.nextInt();
        int[] numArray = new int[numInArray];
        for (int i = 0; i < numInArray; i++) {
            System.out.print("Number " + i + ": ");
            numArray[i] = scanner.nextInt();
        }
        System.out.print("What number would you like to divide by?: ");
        int divider = scanner.nextInt();

        if (!areFactors(divider, numArray)){
            System.out.println("The numbers could not be divided!");
        } else {
            System.out.println("All the numbers could be divided!");
        }
    }
}
