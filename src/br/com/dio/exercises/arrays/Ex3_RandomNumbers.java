package br.com.dio.exercises.arrays;

/*
write a program that reads 20 random numbers between 0 and 100
store them in a vector
 */

import java.util.Random;

public class Ex3_RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random(); //random is a class that generates random numbers

        int [] randomNumbers = new int[20];

        //foreach: we dont have access to the exact position. in For we do thats why we used it.

        for (int i = 0; i < randomNumbers.length; i++){
            //create variable number to say that it will keep the random number generated
            int number = random.nextInt(100); //100 is the limit
            randomNumbers[i] = number;

        }
        System.out.print("Random numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");

        }
        //when u are asked to bring the successor of a number:
        System.out.print("\nSuccessor of the random numbers: ");
        for (int number : randomNumbers) {
            System.out.print( (number+1) + " "); //each number + 1. -1 the antecessor

        }



    }
}
