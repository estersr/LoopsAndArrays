package br.com.dio.exercises.loops;

//Develop a multiplication table
//capable to multiply any number between 1 and 10
//the user must inform which number he wants
//the return must look like this:

/* 5 Multiplication Table
 5 x 1 = 5
 5 x 2 = 10
 ...
 5 x 10 = 50
 */

import java.util.Scanner;

public class Ex5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Multiplication Table: ");
        int multTable = scan.nextInt();

        System.out.println("Multiplication Table of: " + multTable);


        //i is the same thing of count here
        // i = i + 1 its the same thing of i++
        for (int i = 1; i <= 10; i++) {
            System.out.println(multTable + " x " + i + " = " + (multTable*i));

        }



    }
}
