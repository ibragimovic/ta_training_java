package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{-3, 2, 4, 3, 5, 12, 8};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {
        int size = 0;
        if (array[0] > array[1]) {
            size++;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                size++;
            }
        }
        if (array[array.length - 1] > array[array.length - 2]) {
            size++;
        }
        int[] copyArray = new int[array.length - size];


        for (int i = 0; i < array.length - 1; i++) {
            int previous;
            if (i - 1 == -1) {
                previous = Integer.MIN_VALUE;
            } else {
                previous = array[i - 1];
            }

            if (array[i] <= previous || array[i] <= array[i + 1]) {
                copyArray[i] = array[i];
            }
        }

        if (array[array.length - 1] <= array[array.length - 2]) {
            copyArray[copyArray.length - 1] = array[array.length - 1];
        }

        return copyArray;
    }

}
