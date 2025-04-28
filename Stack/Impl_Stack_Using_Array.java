package DSA.Stack;

import java.util.Scanner;

class Stack{
    Scanner sc=new Scanner(System.in);
    int top=-1;
    int size=10;
    int x;
    int a[]=new int[size];
    public void push(){
        if(top==(size-1)){
            System.out.println("Overflow");
        }else {
               System.out.println("Enter the data");
               int data=sc.nextInt();
               top=top+1;
               a[top]=data;
               System.out.println("Item inserted");
        }
    }
    public void pop(){
        int x;
        if(top==-1){
            System.out.println("Underflow");
        }else {
                top=top-1;
                System.out.println("Item deleted");

        }
    }
    public void display(){
        for (int i = top; i >=0; i--) {
            System.out.println(a[i]);
        }
    }

}
public class Impl_Stack_Using_Array {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        do{
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.DISPLAY");
            int input=sc.nextInt();
            switch (input){
                case 1:{
                    s.push();
                    break;
                }
                case 2:{
                    s.pop();
                    break;
                }case 3:{
                    s.display();
                    break;
                }

            }
            System.out.println("1. MAIN MENU 2. EXIT");
            x=sc.nextInt();
        }while (x==1);
    }


}
