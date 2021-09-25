package by.bsuir.oop.lab.t7;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int n = main.getN();
        float[] array = main.sortArray(main.getArray(n), n-1);
        System.out.println(Arrays.toString(array));
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

    private float[] sortArray(float[] array, int lastIndex){
        int i = 0;
        while (i < lastIndex){
            if (array[i] <= array[i+1])
                i++;
            else {
                float p = array[i];
                array[i] = array[i+1];
                array[i+1] = p;
                if (i > 0)
                    i--;
            }
        }
        return array;
    }
}
