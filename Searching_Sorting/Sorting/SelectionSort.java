package DSA.Searching_Sorting.Sorting;

import java.util.Scanner;

public class SelectionSort {
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
        for ( i = 0; i < arr.length-1; i++) {
            loc=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[loc]){
                    loc=j;
                    System.out.println(loc);
                }
            }
            int temp=arr[i];
            arr[i]=arr[loc];
            arr[loc]=temp;
        }
        for (i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
