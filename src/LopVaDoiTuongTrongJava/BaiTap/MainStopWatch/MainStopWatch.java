package LopVaDoiTuongTrongJava.BaiTap.MainStopWatch;

import java.util.Random;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] array = generateNumber();
        stopWatch.start();
        System.out.println("Running...");
        selectionSort(array);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime() + " Second");
    }
    static int randomFill() {
        Random rand = new Random();
        return rand.nextInt(100000);
    }
    static void print100Number() {
        for (int i = 0; i < 100000; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    static void display(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }
    static int[] generateNumber() {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomFill();
        }
        return arr;
    }
    static int[] selectionSort(int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

