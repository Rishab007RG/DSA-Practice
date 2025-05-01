package DSA.Tree;

import java.util.Scanner;

public class Impl_Tree_Using_LinkedLIst {
     static Node createNode(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the valur");
        int data=sc.nextInt();
        Node newNode=new Node(data);
        if(data==-1){
            return null;
        }
        System.out.println("Enter the left value for the node "+newNode.data);
        newNode.left=createNode();
        System.out.println("Enter the right value for the node "+newNode.data);
        newNode.right=createNode();
        return newNode;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void main(String[] args) {
        Node root=createNode();
        System.out.println("value: "+root);
    }
}
