package DSA.Searching_Sorting.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int search,arr[],no,i;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be added in the array");
        no=sc.nextInt();
        arr=new int[no];
        System.out.println("Enter the elements to the array");
        for (i = 0; i < no; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        search=sc.nextInt();
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==search){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Item exist at position "+i);
        }else {
            System.out.println("Item doesn't exist");
        }
    }
}
