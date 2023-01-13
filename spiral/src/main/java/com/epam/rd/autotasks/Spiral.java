package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int number = 1;
        int maxNumber = rows * columns;
        int rowMin = 0, rowMax = rows - 1;
        int columnMin = 0, columnMax = columns - 1;
        int[][] array = new int[rows][columns];
        while (number <= maxNumber) {
            for (int i = columnMin; number <= maxNumber && i <= columnMax; i++) {
                array[rowMin][i] = number++;
            }
            rowMin++;
            for (int i = rowMin; number <= maxNumber && i <= rowMax; i++) {
                array[i][columnMax] = number++;
            }
            columnMax--;
            for (int i = columnMax; number <= maxNumber && i >= columnMin; i--) {
                array[rowMax][i] = number++;
            }
            rowMax--;
            for (int i = rowMax; number <= maxNumber && i >= rowMin; i--) {
                array[i][columnMin] = number++;
            }
            columnMin++;
        }
        return array;
    }
}
