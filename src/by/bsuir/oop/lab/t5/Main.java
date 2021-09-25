package by.bsuir.oop.lab.t5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int n = main.getN();
        int[] array = main.getArray(n);
        System.out.println(Arrays.toString(array));
        System.out.println(main.calculateQuantity(array, n));
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

    private int calculateQuantity(int[] array, int n) {
        int [] counts = new int [n];
        Arrays.fill(counts, 1);
        if (array.length == 0)
            return 1;
        for (int j = 0; j < array.length; j++){
            for (int i = 0; i < j; i++){
                if ((array[j] > array[i]) && (counts[j] <= counts[i]))
                    counts[j] = counts[i] + 1;
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++){
            if (counts[i] > counts[maxIndex])
                maxIndex = i;
        }
        return n-counts[maxIndex];
    }
}
