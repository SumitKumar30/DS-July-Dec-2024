import java.util.Scanner;
class DoublyListOperations{

    // 1. Insertion at the begenning
    static void insertAtBeg(int value, DoublyNode head){
            DoublyNode newNode = new DoublyNode(value); // creation of new node.
          if (head == null) // means LinkedList is empty.
                 head = newNode; //  newNode <--- last
          else
                 head.previous = newNode; // newNode <-- old first
          newNode.next = head; // newNode --> old first
          head = newNode; // first --> newNode
    }

    // 2. Insertion at the end
    static DoublyNode insertAtEnd(int value, DoublyNode head){
        DoublyNode newNode = new DoublyNode(value);
        DoublyNode temp = head;
        // if this is the first time you're inserting a new node
        if(head == null){
            newNode.next = null;
            newNode.previous = null;
            head = newNode;
        }
        else{
            while(temp.next != null ){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
            newNode.next = null;
        }
        return head;
    }

    // 3. Inesrtion at a given position
    static void insertAtPos(){

    }


    // 4. Traversing a DLL
    static void traverse(DoublyNode head){
        DoublyNode temp = head;
        while(temp != null){
            System.out.print("-->"+temp.value+"-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        DoublyNode head = null; 

        System.out.println("Enter the size of DLL: ");
        int size = sc.nextInt();
        
        System.out.println("Please enter the values to be inserted in a DLL at the begenning.. :");

        for(int i = 0; i < size; i++ ){
           head = insertAtEnd(sc.nextInt(), head);
        }
        traverse(head);
    }
}