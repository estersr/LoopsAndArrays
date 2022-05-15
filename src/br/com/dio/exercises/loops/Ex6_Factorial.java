package br.com.dio.exercises.loops;
/*
Write a program that calculates the factorial of an int number provided by the user
ex: 5 != 20 ( 5 x 4 x 3 x 2 x 1)
 */


import java.util.Scanner;

public class Ex6_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Factorial: ");
        int factorial = scan.nextInt();

        int multiplication = 1; //i cant start with 0, because 0 * any number is zero


        //int i = factorial the count will start with it. while i >= 1
        // i = i - 1 a cada looping eu vou diminuindo o valor

        System.out.print(factorial + " ! = " );
        for (int i = factorial; i >= 1; i--) {
            multiplication = multiplication * i; // i is the number that is changing

        }

        System.out.println(multiplication);


    }
}
