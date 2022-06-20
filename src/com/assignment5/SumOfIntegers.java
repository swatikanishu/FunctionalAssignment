package com.assignment5;
import java.util.Scanner;
public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please enter the N integer : ");
        int num = scanner.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print(" Enter the " + (i + 1) + " element: ");
            array[i] = scanner.nextInt();

        }
        int TotalTriple = 0;
        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(" the numbers " + array[i] + ", " + array[j] + ", " + array[k] + " add to 0");
                        TotalTriple++;
                    }
                }
            }
        }

        System.out.println("Total number of triples are equal to: " + TotalTriple);
    }
}

