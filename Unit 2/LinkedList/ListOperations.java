import java.util.Scanner;
class ListOperations{

    // insert a new node object at the begenning
    static Node insertAtBegenning(int value, Node head){
         Node newNode = new Node(value);
         
         // if this is the first time
         if(head == null){
             head = newNode;
         }
         else{
             // assign the address of previous starting node object
            newNode.address = head;
            // update the head reference 
            head = newNode;
         }
         return head;
    }

    // insert a new node object at the end
    static Node insertAtEnd(int value, Node head){
         Node newNode = new Node(value);
         Node temp = head;
         while(temp.address != null){
             temp = temp.address;
         }
         temp.address = newNode;
         newNode.address = null;

         return head;
    }

    static Node insertAtPos(int value, int pos, Node head){
        Node newNode = new Node(value);
         Node temp = head;
        for(int loc = 1; loc < pos-1; loc++){
            temp = temp.address;
        }
        newNode.address = temp.address;
        temp.address = newNode;
        return head;
    }

    // Deletion at the begenning
    static Node deleteAtBeg(Node head){
        Node temp = head;
        head = head.address;
        // remove outgoing & incoming references 
        temp.address = null;
        temp = null;
        return head;
    }

    // Deletion at the end
    static Node deleteAtEnd(Node head){
        // add your logic here
    }

    static void traverse(Node head){
        Node temp = head;   
        while(temp != null){    // till the time temp is not null
            System.out.print(temp.data+"-->");
            temp = temp.address;
        }
        if(temp == null)
            System.out.print("null");
        System.out.println();
    }
    
    public static void main(String[] args){
        // Create a Node object
        Node a = new Node(12);
        Node b = new Node(25);
        Node c = new Node(15);
        Node d = new Node(56);
        Node e = new Node(87);
        Node f = new Node(45);

        // link the node objects
        Node head = f;  // address of starting node object
        f.address = e;  // f is pointing to e
        e.address = d;
        d.address = c;
        c.address = b;
        b.address = a;
        a.address = null;   // tail node or termination

        // System.out.println("Address of node f is: "+f);

        // traversing a linked list
        traverse(head);

        System.out.println("Enter the element you want to insert: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        head = insertAtBegenning(value, head);
        System.out.println("Insertion at the begenning...");
        traverse(head);

        System.out.println("Enter the element you want to insert at the end: ");
        int value2 = sc.nextInt();
        head = insertAtEnd(value2, head);
        traverse(head);

        System.out.println("Enter the value you want to insert at a given position: ");
        int value3 = sc.nextInt();

        System.out.println("Enter the position where you want to insert the new node: ");
        int pos = sc.nextInt();

        head = insertAtPos(value3, pos, head);

        traverse(head);

        System.out.println("Deletion at the begenning...");
        head = deleteAtBeg(head);

        traverse(head);

        System.out.println("Deletion at the end... ");
    }

   
}