package DSA;

import java.util.Scanner;

public class LinkedListCreat_Print {
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
        LinkedListCreat_Print ll=new LinkedListCreat_Print();
        ll.creation();
        ll.printing();
        ll.delete();
        ll.printing();
    }
    static void creation(){
        int data,n;
        Scanner sc=new Scanner(System.in);
       do {
           System.out.println("Enter the data");
           data=sc.nextInt();
           Node newNode=new Node(data);
           if(head==null){
               head=newNode;
           }else {
               newNode.next=head;
               head=newNode;
           }
           System.out.println("Do you want to enter new data if yes press 1 else enter 2");
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
                        LinkedListCreat_Print.Node temp=head;
                        temp=temp.next;
                        head=temp;
                        break;
                    case 2:
                        LinkedListCreat_Print.Node temp1=head;
                        LinkedListCreat_Print.Node ptr=temp1.next;
                        while (temp1.next!=null){
                            temp1=ptr;
                            ptr=temp1.next;
                        }
                        temp1.next=null;
                        break;

                    case 3:
                        System.out.println("Enter Location for deleting");
                        LinkedListCreat_Print.Node temp2=head;
                        LinkedListCreat_Print.Node ptr2 =temp2.next;
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
    static  void printing(){
        Node temp=head;
        if(head==null){
            System.out.println("Node dosen't exit");
        }else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
