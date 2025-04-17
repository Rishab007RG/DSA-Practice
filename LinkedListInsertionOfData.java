package DSA;

import java.util.Scanner;

public class LinkedListInsertionOfData {
    static class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        this.next=null;
        }
    }
    static Node head=null;
    public static void main(String[] args) {
       create();
       print();
       delete();
       print();
    }
    static void create(){
        int data,n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the data");
            data=sc.nextInt();
            Node newNode=new Node(data);
            if (head==null){
                head=newNode;
            }else {
                System.out.println("Select 1 to enter the data in the beginning; 2 for in the end; 3 for specific place");
                int opt=sc.nextInt();

                switch (opt){
                    case 1:
                        newNode.next=head;
                        head=newNode;
                        break;
                    case 2:
                        Node temp=head;
                        while (newNode.next!=null){
                            temp=temp.next;
                        }
                        temp.next=newNode;
                        break;
                    case 3:
                        Node temp1=head;
                        System.out.println("Enter the position for the data to be entered");
                        int pos=sc.nextInt();
                        for (int i = 0; i < (pos-1); i++) {
                            temp1.next=temp1.next;
                        }
                        newNode.next=temp1.next;
                        temp1.next=newNode;
                        break;
                }

            }
            System.out.println("Enter 1 to add data else 2 to exit");
            n=sc.nextInt();

        }
        while (n==1);
    }
    static void delete(){
        int data,n,m,p;
        Scanner sc=new Scanner(System.in);
        do {
            if(head==null){
                System.out.println("Node doesn't exist");
            }else {
                System.out.println("If you want to delete the item from the beginning press 1, 2 from the end ,3 from the specific position");
                n= sc.nextInt();
                switch (n){
                    case 1:
                        Node temp=head;
                        temp=temp.next;
                        head=temp;
                        break;
                    case 2:
                        Node temp1=head;
                        Node ptr=temp1.next;
                        while (temp1.next!=null){
                            temp1=ptr;
                            ptr=temp1.next;
                        }
                        temp1.next=null;
                        break;

                    case 3:
                        System.out.println("Enter Location for deleting");
                        Node temp2=head;
                        Node ptr2 =temp2.next;
                        p=sc.nextInt();
                        for (int i = 0; i < (p-2); i++) {
                            temp2= ptr2;
                            ptr2 =ptr2.next;
                        }
                        temp2.next=ptr2.next;
                        break;

                }
            }
            System.out.println("Enter 1 if u want delete more items");
            m= sc.nextInt();
        }while(m==1);
    }
    static void print(){
        LinkedListInsertionOfData.Node temp=head;
        if(head==null){
            System.out.println("Node doesn't exit");
        }else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
