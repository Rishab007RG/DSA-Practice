package DSA.Stack;

import java.util.Scanner;


class StackLinkedList{
    Scanner sc=new Scanner(System.in);
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node top=null;
    public void push(){
        System.out.println("Enter the data");
        int data=sc.nextInt();
        Node newNode=new Node(data);
        if(top==null){
            top=newNode;
        }else {
            newNode.next=top;
            top=newNode;
        }
        System.out.println("Item inserted");
    }
    public void pop(){
        int x;
        if(top==null){
            System.out.println("Underflow");
        }else {
            Node temp=top;
            top=temp.next;
            System.out.println("Element popped");
        }
    }
    public void display(){
        Node temp=top;
        while (temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
}

public class Impl_Stack_Using_LinkedList {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        StackLinkedList s=new StackLinkedList();
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
