import java.util.Scanner;
class ListSpecialOperations{
    
    // Swap first and last node 
    static Node swapFirstLast(Node head){
        Node current = head;
        Node temp = head;
        Node newhead = null;
        // move temp to second last node
        while(temp.address.address != null){
            temp = temp.address;
            newhead = temp.address;
        }
        temp.address.address = current.address;
        temp.address = current;
        // making the first node as tail node
        current.address = null;
        head = newhead;
        return head;
    }
    
    // Print the first and last occurrence of given element
    static Node countFirstLast(Node head, int key){
        int occurrence = 0; 
        int position = 0;
        Node temp = head;
        while(temp != null){
            // increment position by 1
            position++;
            // check if the given value is matched
            if(temp.data == key){
                occurrence++;
                if(occurrence == 1){
                    System.out.println(key+" occurrs at position: "+position+" for the first time");
                }
                else{
                    // save the last position of given element
                    occurrence = position;
                }
            }
            temp = temp.address;
        }
        System.out.println("Last occurence position of "+key+" is: "+occurrence);
        return head;
    }

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

    // Deletion at the begenning
    static Node deleteAtBeg(Node head){
        Node temp = head;
        head = head.address;
        // remove outgoing & incoming references 
        temp.address = null;
        temp = null;
        return head;
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
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter the size of linked list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        
        for(int i = 0; i < size; i++){
            head = insertAtBegenning(sc.nextInt(), head);
        }

        traverse(head);

        System.out.println("List after swapping first & last node...");
        head = swapFirstLast(head);

        traverse(head);

        System.out.println("Enter the element whose occurence you want to check: ");
        int key = sc.nextInt();

        head = countFirstLast(head, key);
    }
}