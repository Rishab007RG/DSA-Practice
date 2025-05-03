package DSA.Searching_Sorting.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int search,arr[],no,i,mid;
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
        int beg=0,end=no-1;
        mid=(beg+end)/2;
        while (beg<=end){
            if(search==arr[mid]){
                System.out.println("here 1st");
                flag=true;
                break;
            }else if(search>arr[mid]) {
                System.out.println("here 1st");

                beg=mid+1;
            } else if (search<arr[mid]) {
                System.out.println("here 1st");

                end=mid-1;
            }
        }
        if(flag){
            System.out.println("Item present at the position "+mid);
        }
    }
}

