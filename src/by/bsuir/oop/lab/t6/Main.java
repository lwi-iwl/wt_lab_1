package by.bsuir.oop.lab.t6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int n = main.getN();
        float[] array = main.getArray(n);
        float[][] matrix = main.getMatrix(array, n);
        main.printMatrix(matrix, n);
    }

    private int getN(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n");
        return in.nextInt();
    }

    private float[] getArray(int n){
        float [] array = new float[n];
        Scanner in = new Scanner(System.in);
        for (int counter = 0; counter < n; counter++){
            System.out.printf("Введите %d число\n", counter+1);
            array [counter] = in.nextFloat();
        }
        return array;
    }

    private float[][] getMatrix(float[] array, int n) {
        float[][] matrix = new float [n][n];
        for (int j = 0; j < n; j++) {
            int i = 0;
            for (int k = j; k < n; k++) {
                matrix[i][j] = array[k];
                i++;
            }
            for (int k = 0; k < j; k++) {
                matrix[i][j] = array[k];
                i++;
            }
        }
        return matrix;
    }

    private void printMatrix(float [][] matrix, int n){
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++)
                System.out.printf("%6.3f", matrix[j][i]);
            System.out.println("\n");
        }
    }
}
