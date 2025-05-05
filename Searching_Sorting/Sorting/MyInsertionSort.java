package DSA.Searching_Sorting.Sorting;

import java.util.Scanner;

public class MyInsertionSort {
    public static void main(String[] args) {
        int arr[],no,i,loc;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be added in the array");
        no=sc.nextInt();
        arr=new int[no];
        System.out.println("Enter the elements to the array");
        for (i = 0; i < no; i++) {
            arr[i]=sc.nextInt();
        }
        for ( i = 0; i < arr.length-1 ; i++) {
            while (arr[i+1]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                for (int j = i+1; j >0; j--) {
                    if(arr[j]<arr[j-1]){
                        temp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+" ");
        }
    }
}
