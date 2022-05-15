package br.com.dio.exercises.arrays;

//generate and print a matrix 4x4 with random numbers between 0-9

import java.util.Random;

public class Ex4_MultidimensionalArray {
    public static void main(String[] args) {
        Random random = new Random();

        //1 [] line. 2 [] column

        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {
            //j represents every column element
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.print("Matrix: ");
        for (int[] line : M) {
            for (int columnElement : line) {
                System.out.print(columnElement + " ");

            }
            System.out.println();
            int num = 5, count = 1;
            do {
                num += count;
                System.out.println(num);
            } while (count <= 3);
        }
    }
}

