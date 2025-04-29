package DSA.Queue;

import java.util.Scanner;

class QueueLinkedList{
   class Node{
       int data;
       Node next;
       Node(int data){
           this.data=data;
           this.next=null;
       }
   }
   Node front=null;
   Node rear=null;

    public void enqueue(Scanner sc) {
        // NOTE: While implementing queue using LinkedList the data is entered in the end (rear end)
        System.out.println("Enter the value");
        int data=sc.nextInt();
        Node newNode=new Node(data);
        if(front==null && rear==null){
            front=newNode;
            rear=newNode;
        }else {
            rear.next=newNode;
            rear=newNode;
        }
    }

    public void dequeue() {
        if(front==null && rear==null){
            System.out.println("Underflow");
        }else {
            front=front.next;
            System.out.println("element deleted");
        }
    }

    public void display() {
        System.out.println("elements are: ");
        Node temp=front;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Impl_Queue_Using_LinkedList {
    public static void main(String[] args) {
        QueueLinkedList qa=new QueueLinkedList();
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
