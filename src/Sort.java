import java.util.Arrays;
import java.util.Random;

public class Sort {
    Random random = new Random();
    private int[] array;

    public Sort() {
        array = new int[1000000];
        addElement();
    }

    /*public void show() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
    }*/

    //Add values to array
    public void addElement() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 15;
        }
    }

    // Bubble Sort
    public void bubbleSort() {
        long timeBefore = System.currentTimeMillis();
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        long timeAfter = System.currentTimeMillis();
        System.out.println("Time Bubble Sort:  " + (timeAfter - timeBefore));
    }

    // Insertion Sort
    public void insertionSort() {
        int temp, j;
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
        long timeAfter = System.currentTimeMillis();
        System.out.println("Time Insertion Sort:  " + (timeAfter - timeBefore));
    }

    //Selection Sort
    public void selectionSort() {
        int min, temp;
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        long timeAfter = System.currentTimeMillis();
        System.out.println("Time Selection Sort:  " + (timeAfter - timeBefore));
    }

    // Shell Sort
    public void shellSort() {
        long timeBefore = System.currentTimeMillis();
        int j;
        for (int div = array.length / 2; div > 0; div /= 2) {
            for (int i = div; i < array.length; i++) {
                int temp = array[i];
                for (j = i; j >= div && array[j - div] > temp; j -= div) {
                    array[j] = array[j - div];
                }
                array[j] = temp;
            }
        }
        long timeAfter = System.currentTimeMillis();
        System.out.println("Time Shell Sort:  " + (timeAfter - timeBefore));
    }

    // Quick Sort
    public void quickSort() {
        int left = 0;
        int right = array.length - 1;
        long timeBefore = System.currentTimeMillis();
        quick(left, right);
        long timeAfter = System.currentTimeMillis();
        System.out.println("Time Quick Sort:  " + (timeAfter - timeBefore));
    }

    // Quick Sort continuation 1
    public void quick(int left, int right) {
        int index = partition(left, right);
        if (left < index - 1) {
            quick(left, index - 1);
        }
        if (index < right) {
            quick(index, right);
        }
    }

    // Quick Sort continuation 2
    public int partition(int left, int right) {
        int i = left, j = right;
        int tmp;
        int middle = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < middle) {
                i++;
            }
            while (array[j] > middle) {
                j--;
            }
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}
