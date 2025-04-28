package DSA.LinkList;

import java.util.Scanner;

public class Circular_LL_creation_insertion_deletion {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    static Node tail=null;
    public static void creation(){
        int x;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the value to be entered");
            int input= sc.nextInt();
            Node newNode=new Node(input);
            if(head==null){
                head=newNode;
                tail=newNode;
                newNode.next=head;
            }else {
                System.out.println("1.In the Beginning 2.In the End 3.In the required position");
                int insert= sc.nextInt();
                switch (insert){
                    case 1:{
                        newNode.next=head;
                        head=newNode;
                        tail.next=head;
                        break;
                    }
                    case 2:{
                        tail.next=newNode;
                        tail=newNode;
                        newNode.next=head;
                        break;
                    }
                    case 3:{
                        Node temp=head;
                        System.out.println("Enter the position to enter the data");
                        int pos=sc.nextInt();
                        for (int i = 0; i < pos-1; i++) {
                            temp=temp.next;
                        }
                        newNode.next=temp.next;
                        temp.next=newNode;
                        break;
                    }
                }
            }
            System.out.println("To enter the data again press 1");
            x=sc.nextInt();
        }while (x==1);
    }
    public static void travers(){
        Node temp=head;
        if(head==null){
            System.out.println("List doesn't exist");
        }else {
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }while (temp!=head);
        }
    }
    public static void deletion(){
        int x;
        Scanner sc=new Scanner(System.in);
        do{

            if(head==null){
                System.out.println("list doesn't exist");
            }else {
                System.out.println("deletion : 1.In the Beginning 2.In the End 3.In the required position");
                int insert= sc.nextInt();
                switch (insert){
                    case 1:{
                        Node temp=head;
                        temp=temp.next;
                        head=temp;
                        tail.next=head;
                        break;
                    }
                    case 2:{
                        Node temp=head;
                        Node ptr=temp.next;
                        while (ptr.next!=head){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=head;
                        tail=temp;
                        break;
                    }
                    case 3:{
                        Node temp=head;
                        Node ptr=temp.next;
                        System.out.println("Enter the position to delete the data");
                        int pos=sc.nextInt();
                        for (int i = 0; i < pos-1; i++) {
                            temp=temp.next;
                        }
                        temp.next=temp.next.next;
                        break;
                    }

                }
            }
            System.out.println("To enter the data again press 1");
            x=sc.nextInt();
        }while (x==1);
    }

    public static void main(String[] args) {
        creation();
        travers();
        deletion();
        travers();
    }
}
