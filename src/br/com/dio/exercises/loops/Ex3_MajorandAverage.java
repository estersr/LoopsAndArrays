package br.com.dio.exercises.loops;

//write a program that reads 5 numbers
//inform the major number
//inform the average of these numbers.

import java.util.Scanner;

public class Ex3_MajorandAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int count = 0;
        int major = 0;
        int addition = 0;


        do {
            System.out.println("Number: ");
            number = scan.nextInt();

            addition = addition + number;

            if (number > major) major = number;


            count = count + 1;
        } while(count < 5);

        System.out.println("Major: " + major);
        System.out.println("Average: " + (addition/5));



    }
}
