package DSA.Queue;

import java.util.Scanner;

class CircularQueueArray{
    int size=3;
    int a[]=new int[size];
    int f=-1;
    int r=-1;

    public void enqueue(Scanner sc) {
        System.out.println("Enter the value");
        int data=sc.nextInt();
        if(f==(r+1)%size){
            System.out.println("Overflow");
        }else if(f==-1 && r==-1){
            f=0;
            r=0;
            a[r]=data;
        }else {
            r=(r+1)%size;
            a[r]=data;
        }
    }

    public void dequeue() {
        if(f==-1 && r==-1){
            System.out.println("Underflow");
        } else if (f==r) {
            System.out.println("underflow");
            f=-1;
            r=-1;
        } else {
            f=(f+1)%5;
            System.out.println("element deleted");
        }
    }

    public void display() {
        int i;
        System.out.println("The elements are: ");
        for (i = f; i !=r ; i=(i+1)%size) {
            System.out.println(a[i]+" ");
        }
        System.out.println(a[i]);
    }
}
public class Impl_CircularQueue_Using_Array {
    public static void main(String[] args) {
        CircularQueueArray qa=new CircularQueueArray();
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
