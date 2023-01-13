package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length > 0) {
            int temp = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = temp;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length > 0) {
            int[] secondHalf = new int[shift];
            System.arraycopy(array, array.length - shift, secondHalf, 0, shift);

            int[] firstHalf = new int[array.length - shift];
            System.arraycopy(array, 0, firstHalf, 0, array.length - shift);

            System.arraycopy(secondHalf, 0, array, 0, secondHalf.length);
            System.arraycopy(firstHalf, 0, array, shift, firstHalf.length);
        }
    }
}
