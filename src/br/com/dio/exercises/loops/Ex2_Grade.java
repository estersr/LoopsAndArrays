package br.com.dio.exercises.loops;

//write a program that asks for a grade, between 0 and 10.
//show a message if the grade number is invalid.
//keep asking until the user write a valid value.

import java.util.Scanner;

public class Ex2_Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade;

        System.out.println("Grade: ");
        grade = scan.nextInt();

        while (grade < 0 || grade > 10) {
            System.out.println("Invalid grade! Type again.");
            grade = scan.nextInt(); //in case it's invalid, the option to type again
        }

    }


}
