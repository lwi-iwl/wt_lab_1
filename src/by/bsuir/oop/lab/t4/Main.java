package by.bsuir.oop.lab.t4;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int n = main.getN();
        int[] array = main.getArray(n);
        System.out.println(Arrays.toString(array));
        main.printNumbers(array, n);
    }

    private int getN(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n");
        return in.nextInt();
    }

    private int[] getArray(int n){
        int [] array = new int[n];
        Scanner in = new Scanner(System.in);
        for (int counter = 0; counter < n; counter++){
            System.out.printf("Введите %d число\n", counter+1);
            array [counter] = in.nextInt();
        }
        return array;
    }

    private void printNumbers(int[] array, int n) {
        for (int i = 0; i < n; i++){
            if (BigInteger.valueOf(array[i]).isProbablePrime((int)Math.log(array[i])) && array[i]>1)
                System.out.printf("%d ", i+1);
        }
    }
}
