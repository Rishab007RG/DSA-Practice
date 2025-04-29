package DSA.Queue;

import java.util.Scanner;

class QueueArray{
int size=7;
int a[]=new int[size];
int f=-1;
int r=-1;

    public void enqueue(Scanner sc) {
        System.out.println("Enter the value");
        int data=sc.nextInt();
        if(r==size-1){
            System.out.println("Overflow");
        }else if(f==-1 && r==-1){
                f=f+1;
                r=r+1;
                a[r]=data;
        }else {
            r=r+1;
            a[r]=data;
        }
    }

    public void dequeue() {
        if(f==-1 && r==-1){
            System.out.println("Underflow");
        }else {
            f=f+1;
            System.out.println("element deleted");
        }
    }

    public void display() {
        System.out.println("elements are: ");
        for (int i = f; i <= r; i++) {
            System.out.println(a[i]);
        }
    }
}

public class Impl_Queue_Using_Array {
    public static void main(String[] args) {
        QueueArray qa=new QueueArray();
        Scanner sc=new Scanner(System.in);
        int x;
       do{
           System.out.println("1.Enqueue");
           System.out.println("2.Dequeue");
           System.out.println("3.Display");
           int iniput=sc.nextInt();
           switch (iniput){
               case 1:{
                   qa.enqueue(sc);
                   break;
               }
               case 2:{
                   qa.dequeue();
                   break;
               }
               case 3:{
                   qa.display();
                   break;
               }
           }
           System.out.println("1.MAIN MENU 2.EXIT");
           x=sc.nextInt();
       }while (x==1);
    }
}
