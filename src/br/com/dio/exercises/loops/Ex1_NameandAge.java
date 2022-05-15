package br.com.dio.exercises.loops;


//Create a system that reads 2 values.
//The first one representing the student's name and it's age.
//(stop the system inserting the value 0 on the name field)

import java.util.Scanner;

public class Ex1_NameandAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //The Scanner is a flow used to read

        String name;
        int age;

        while (true) {
            System.out.println("Name: ");
            name = scan.next();
            if (name.equals("0")) break;

            System.out.println("Age: ");
            age = scan.nextInt();
        }

        System.out.println("Continue...");




    }
}