package DSA.LinkList;

import java.util.Scanner;

public class Doubly_LL_creation_traversal {
   static class Node{
       int data;
       Node next;
       Node previous;
       Node(int data){
           this.data=data;
           this.next=null;
           this.previous=null;
       }
    }
    Node head=null;
    Node tail=null;
    public void creation(){
       int x;
        Scanner sc=new Scanner(System.in);
       do{
           System.out.println("Enter the data");
           int data=sc.nextInt();
           Node newNode=new Node(data);
           if(head==null){
               head=newNode;
               tail=newNode;
           }else {
               System.out.println("Insert :  1.In the beginning 2.In the end 3.In the required position");
               int choice=sc.nextInt();
               switch (choice){
                   case 1:{
                       head.previous=newNode;
                       newNode.next=head;
                       head=newNode;
                       break;
                   }
                   case 2:{
                       tail.next=newNode;
                       newNode.previous=tail;
//                       newNode.next=null;
                       tail=newNode;
                       break;
                   }
                   case 3:{
                       Node temp=head;
                       Node psv=temp.next;
                       System.out.println("Enter the position you want to enter the data");
                       int pos=sc.nextInt();
                       for (int i = 0; i < pos-1; i++) {
                           temp=psv;
                           psv=psv.next;
                       }
                       temp.next=newNode;
                       newNode.previous=temp;
                       psv.previous=newNode;
                       newNode.next=psv;
                       break;
                   }
               }
           }
           System.out.println("To enter more data click 1");
           x=sc.nextInt();
       }while (x==1);
    }
    public void deletion(){
        int x;
        Scanner sc=new Scanner(System.in);
        do{
            if(head==null){
                System.out.println("List doesn't exist");
            }else {
                System.out.println("delete :  1.In the beginning 2.In the end 3.In the required position");
                int choice=sc.nextInt();
                switch (choice){
                    case 1:{
                        Node temp=head;
                        temp=temp.next;
                        head=temp;
                        break;
                    }
                    case 2:{
                        Node temp=tail;
                        temp=temp.previous;
                        tail=temp;
                        break;
                    }
                    case 3:{
                        Node temp=head;
                        Node psv=temp.next;
                        System.out.println("Enter the position you want to delete the data");
                        int pos=sc.nextInt();
                        for (int i = 1; i < pos-1; i++) {
                            temp=psv;
                            psv=psv.next;
                        }
                        psv=psv.next;
                        temp.next=psv;
//                        temp.next=psv.next;    //alternative
//                        psv.next.previous=temp;
                        break;
                    }
                }
            }
            System.out.println("To enter more data click 1");
            x=sc.nextInt();
        }while (x==1);
    }
    public void travers(){
        if(head==null){
            System.out.println("List doesn't exist");
        }else {
            Node temp=head;
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }while (temp!=null);
        }
    }
    public static void main(String[] args) {
        Doubly_LL_creation_traversal connect=new Doubly_LL_creation_traversal();
        connect.creation();
        connect.travers();
        connect.deletion();
        connect.travers();
    }
}
