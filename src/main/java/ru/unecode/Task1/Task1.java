package ru.unecode.Task1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    private static int[] genArray(int length) {
        Random rnd = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(1000);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = genArray(100);
        System.out.println(Arrays.toString(array));
        int i = 0;
        int n = array.length - 1;
        while (i <= n) {
            if (array[i] % 2 == 0) {
                int t = array[i];
                array[i] = array[n];
                array[n] = t;
                n--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

