package DSA.Searching_Sorting.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[], no, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added in the array");
        no = sc.nextInt();
        arr = new int[no];
        System.out.println("Enter the elements to the array");
        for (i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 1; i < arr.length; i++) {
            int temp = arr[i];
            j = i - 1;
            while (j >-1 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }

        System.out.println("Sorted array:");
        for (int z = 0; z < arr.length; z++) {
            System.out.print(arr[z] + " ");
        }
    }
}
