package DSA.LinkList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Practice_Questions {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public static void creation(){
        Scanner sc=new Scanner(System.in);
        int x;
        do{
            System.out.println("Enter the data");
            int data=sc.nextInt();
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }else {
                newNode.next=head;
                head=newNode;
            }
            System.out.println("Enter the data again");
            x=sc.nextInt();
        }while (x==1);
        System.out.println("the list length "+counter(head));;

    }
    public static int counter(Node head){
        System.out.println("1");
        Node temp=head;
        int count=0;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        creation();
    }
}
