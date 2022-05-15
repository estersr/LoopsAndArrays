package br.com.dio.exercises.arrays;

/*
write a program that read a 6 characters vector
and tell how many consonants were read
Print the consonants
 */

import java.util.Scanner;

public class Ex2_Consonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consonants = new String[6]; //i want i to have 6 spaces
        int amountConsonants = 0;
        int count = 0;
        do {
            System.out.println("Letter: ");
            String letter = scan.next();

            //equalsignorecase ignore the letter even if its in caps

            if (!(letter.equalsIgnoreCase("a") |
                    letter.equalsIgnoreCase("e") |
                    letter.equalsIgnoreCase("i") |
                    letter.equalsIgnoreCase("o") |
                    letter.equalsIgnoreCase("u"))) {
                consonants[count] = letter;
                amountConsonants++;
            }
            count++;

        } while (count < consonants.length);

        //for each: lado esquerdo tipo, direito nome do array que quero navegar dentro
        System.out.print("Consonants: ");

        for (String consonant : consonants) {
            if (consonant != null)
            System.out.println(consonant + " ");

        }
        System.out.println("Amount of consonants: " + amountConsonants);

    }
}
