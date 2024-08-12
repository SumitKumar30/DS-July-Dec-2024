package linkedlists;

public class SinglyLinkedList {
    // 1. insertion at the begenning
    static Node insertAtBeg(Node head){
        Node newNode = new Node("H", null);

        if(head == null){
            System.out.println("List is empty!!");
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        
        return head;
    }

    public static void main(String[] args){
        Node a = new Node("A", null);   // a = 100
        Node b = new Node("B", null);   // b = 300
        Node c = new Node("C", null);   // c = 800

        a.next = b;
        b.next = c;
        c.next = null;  // tail node

        Node head = a;  // head ==> 100 

        head = insertAtBeg(head);

        System.out.println("========== Printing the updated list ============");

        Node temp = head;
        while(temp != null){
            
                System.out.print(temp.data+" ==> ");
                temp = temp.next;
        }
        
            System.out.print("null");    
        

    }
}
