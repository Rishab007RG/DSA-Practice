package DSA.GeeksForGeeks.LinkedList;

import java.util.*;

public class MergeKSortedLinkedLists {

    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    class Solution {
        Node mergeKLists(List<Node> arr) {
            int lowest=Integer.MAX_VALUE;
            for (int i = 0; i < arr.size(); i++) {
                Node headValue=arr.get(i);
                int in=1;
                while(in!=0){
                    if(headValue.data<lowest){
                       lowest= headValue.data;
                        while (headValue!=null){

                        }
                    }
                    in--;
                }

//                while (current!=null){
//                    System.out.print(current.data+" ");
//                    current=current.next;
//                }
                System.out.print(", ");
            }
            return null;
        }
    }

    public void run() {
        // Linked list 1: 1 -> 3
        Node head1 = new Node(1);
        head1.next = new Node(3);

        // Linked list 2: 8
        Node head2 = new Node(8);

        // Linked list 3: 4 -> 5 -> 6
        Node head3 = new Node(4);
        head3.next = new Node(5);
        head3.next.next = new Node(6);

        // Create the list of heads
        List<Node> arr = new ArrayList<>();
        arr.add(head1);
        arr.add(head2);
        arr.add(head3);

        // Instantiate Solution and call mergeKLists
        Solution sol = new Solution();
        Node mergedHead = sol.mergeKLists(arr);

        // Print the merged list
        while (mergedHead != null) {
            System.out.print(mergedHead.data + " ");
            mergedHead = mergedHead.next;
        }
    }

    public static void main(String[] args) {
        new MergeKSortedLinkedLists().run();
    }
}
