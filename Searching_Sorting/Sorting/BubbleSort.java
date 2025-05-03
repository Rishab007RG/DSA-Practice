package DSA.Searching_Sorting.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[],no,i;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be added in the array");
        no=sc.nextInt();
        arr=new int[no];
        System.out.println("Enter the elements to the array");
        for (i = 0; i < no; i++) {
            arr[i]=sc.nextInt();
        }
        for (i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int data=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=data;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
