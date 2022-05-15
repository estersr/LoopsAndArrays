package br.com.dio.exercises.arrays;

//create a vector with 6 int numbers and show the inverse order

public class Ex1_ReverseOrder {
    public static void main(String[] args) {


        int[] vector = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vector: ");
        int count = 0;
        while (count < (vector.length)) {
            System.out.println(vector[count] + " " );
            count++;

        }
        // why - 1: the array starts by 0. there is no position 6, although there r 6 elements
        System.out.println("Vector: ");
        for (int i = (vector.length - 1); i >= 0; i --) {
            System.out.println(vector[i ] + " " );
        }




    }
}
