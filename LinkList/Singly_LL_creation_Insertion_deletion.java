package DSA.LinkList;

import java.util.Scanner;
//ForMyScholars Episode 9
public class Singly_LL_creation_Insertion_deletion {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void creation(){
        int x;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter the data");
            int data=sc.nextInt();
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }else {
//                newNode.next=head;
//                head=newNode;
                System.out.println("1.In the beginning 2.In the End 3.In the required position");
                int m=sc.nextInt();
                switch (m){
                    case 1:{
                        newNode.next=head;
                        head=newNode;
                        break;
                    }
                    case 2:{
                        Node dum=head;
                        while (dum.next!=null){
                            dum=dum.next;
                        }
                        dum.next=newNode;
                        break;
                    }
                    case 3:{
                        Node temp=head;
                        System.out.println("Enter the position you want to enter");
                        int loc=sc.nextInt();
                        for (int i = 0; i < loc-1; i++) {
                            temp=temp.next;
                        }
                        newNode.next =temp.next;
                        temp.next=newNode;
                        break;
                    }
                    default:{
                        System.out.println("Invalid input");
                    }
                }
            }
            System.out.println("Enter 1 to enter the data again");
            x=sc.nextInt();
        }while (x==1);
    }
    public void travers(){
        Node temp=head;
        if(head==null){
            System.out.println("List doesn't exist");
        }else {
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public void deletion(){
        int x;
        Scanner sc=new Scanner(System.in);
        do{

            if(head==null){
                System.out.println("List doesn't exist");
            }else {
                System.out.println("Deleting: 1.In the Beginning 2.In the end 3.In the required position");
                int con=sc.nextInt();
                switch (con){
                    case 1:{
                        Node temp=head;
                        temp=temp.next;
                        head=temp;
                        break;
                    }
                    case 2:{
                        Node temp=head;
                        Node ptr=temp.next;
                        while (ptr.next!=null){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=null;
                        break;
                    }
                    case 3:{
                        Node temp=head;
                        System.out.println("Enter the position to delete the value");
                        int pos=sc.nextInt();
                        for (int i = 0; i < pos-1; i++) {
                            temp=temp.next;
                        }
                        temp.next=temp.next.next;
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }

            System.out.println("Do u still want to delete the elements ");
            x=sc.nextInt();
        }while (x==1);
    }

    public static void main(String[] args) {
        Singly_LL_creation_Insertion_deletion classes=new Singly_LL_creation_Insertion_deletion();
        classes.creation();
        classes.travers();
        classes.deletion();
        classes.travers();
    }
}

