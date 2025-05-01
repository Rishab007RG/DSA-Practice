package DSA.Tree;

import java.util.Scanner;

public class BinaryTree_Traversal {
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

    static void inorder(Node node){
        if(node==null)return;
        inorder(node.left);
        System.out.println(node.data+" ");
        inorder(node.right);
    }
    static void preorder(Node node){
        if(node==null)return;
        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    static void postorder(Node node){
         if(node==null)return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data+" ");
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
        System.out.println("preorder");
        preorder(root);
        System.out.println("inorder");
        inorder(root);
        System.out.println("postorder");
        postorder(root);
    }
}
