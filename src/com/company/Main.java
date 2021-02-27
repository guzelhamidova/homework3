package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {2, -3, 5, 0, -7, 2, -6};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.println();
        }

        double[] array1 = {1.2, 5.5, -2.1, -5.1, 2.5, -1.7, -2.3, -2.2, 3.2, 4.7, 3.5, -4.4, 1.3, 2.2, 3.1, 4.1};
        System.out.println(Arrays.toString(array));
        double result = 0.0;
        int buf = 0;
        boolean isNegative = false;

        for (double i : array1) {
            if (i < 0) {
                isNegative = true;
            } else if (isNegative) {
                result += i;
                buf++;
            }
        }
        double number = result / buf;
        System.out.println("Ответ " + number);
    }
}

/*ДЗ на сообразительность:
Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать самый минимальный элемент и смещать его в начало. При этом каждую новую итерацию начинать сдвигаясь вправо, то есть первый проход — с первого элемента, второй проход — со второго и т.д.
И при каждой итерации распечатывать текущее состояние массива
*/