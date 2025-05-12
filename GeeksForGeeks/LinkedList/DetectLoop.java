package DSA.GeeksForGeeks.LinkedList;

public class DetectLoop {
    public static void main(String[] args) {
        // Creating nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Uncomment the below line to create a loop for testing
        // head.next.next.next.next.next = head.next;  // Loop: 5 -> 2

        // Call detectLoop
        boolean result = detectLoop(head);
        System.out.println("Loop detected: " + result);

    }
    public static boolean detectLoop(Node head) {
        boolean flag=false;
        Node temp=head;
        Node pointer=temp.next;
        while(temp!=null){
            if(pointer.next==temp){
                flag=true;
            }else{
                temp=pointer;
                pointer=pointer.next;
            }
            temp=temp.next;
        }
        return flag;
    }
}
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}
