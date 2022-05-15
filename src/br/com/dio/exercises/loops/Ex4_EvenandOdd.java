package br.com.dio.exercises.loops;

//write a program that asks for N integers
//calculate and show the amount of even and odd numbers

import java.util.Scanner;

public class Ex4_EvenandOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberAmount;
        int number;
        int evenAmount = 0, oddAmount = 0;

        System.out.println("Amount of numbers: ");
        numberAmount = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Number: ");
            number = scan.nextInt();


            // evenAmount = evenAmount + 1;
            if (number % 2 == 0) evenAmount++; //% resto - devide the number for 2 equals zero its even
            else oddAmount++;

            count++;        //count = count + 1;
        } while (count < numberAmount);


        System.out.println("Even Numbers: " + evenAmount);
        System.out.println("Odd Numbers: " + oddAmount);



    }
}
