package DSA.Arrays;

import java.util.Scanner;

public class Array_Creation_Insertion_Deletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=sc.nextInt();
        int[] arr=new int[length];
        int[] brr=new int[length-1];
        System.out.println("Enter the elements");
        for (int i = 0; i < length; i++) {
           arr[i]=sc.nextInt();
        }
        //INSERTION
//        System.out.println("Enter the index value to add the element");
//        int n=sc.nextInt();
//        System.out.println("Enter the value to be added");
//        int v=sc.nextInt();
//        for (int i = 0; i < length+1; i++) {
//            if(i<n){
//                brr[i]=arr[i];
//            } else if (i==n) {
//                brr[i]= v;
//            }else {
//                brr[i]=arr[i-1];
//            }
//        }
        System.out.println("The elements are");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
        // DELETION
//        System.out.println("Enter the index to be deleted from the array");
//        int x=sc.nextInt();
//        for (int i = 0; i < length; i++) {
//            if(i<x){
//                brr[i]=arr[i];
//            }else if(i==x){
//                continue;
//            } else{
//                brr[i-1]=arr[i];
//            }
//        }
//        System.out.println("The elements are");
//        for (int i = 0; i < brr.length; i++) {
//            System.out.println(brr[i]);
//        }
    }
}
