package DSA.Searching_Sorting.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int search,arr[],no;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be added in the array");
        no=sc.nextInt();
        arr=new int[no];
        System.out.println("Enter the elements to the array");
        for (int i = 0; i < no; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        search=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search){
                flag=true;
                break;
            }else {
                flag=false;
            }
        }
        if(flag){
            System.out.println("Item exist");
        }else {
            System.out.println("Item doesn't exist");
        }
    }
}
