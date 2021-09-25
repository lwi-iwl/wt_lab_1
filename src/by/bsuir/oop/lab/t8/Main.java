package by.bsuir.oop.lab.t8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int n = main.getSeqLen(1);
        int m = main.getSeqLen(2);
        main.printSpace(main.getArray(n, 1), main.getArray(m, 2), n, m);
    }

    private int getSeqLen(int index){
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите размер %d последовательности\n", index);
        return in.nextInt();
    }

    private float[] getArray(int n, int index){
        float [] array = new float[n];
        Scanner in = new Scanner(System.in);
        for (int counter = 0; counter < n; counter++){
            System.out.printf("Введите %d число %d последовательности\n", counter+1, index);
            array [counter] = in.nextFloat();
        }
        return array;
    }

    private void printSpace(float[] arrayN, float[] arrayM, int n, int m){
        int j = 0;
        int i = 0;
        while (j < m){
            while ((i < n)&&(arrayN[i] < arrayM[j])){
                System.out.printf("%6.3f",arrayN[i]);
                i++;
            }
            System.out.printf("%4s","___");
            j++;
        }
        while (i < n){
            System.out.printf("%6.3f",arrayN[i]);
            i++;
        }
    }
}