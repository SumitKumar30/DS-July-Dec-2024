// Program to pairwise swap elements of a singly linked List
import java.util.Scanner;
class PairWiseSwap {
    Node head; // head of list

    void pairWiseSwap()
    {
        Node temp = head;

        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {

            /* Swap the data */
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        PairWiseSwap llist = new PairWiseSwap();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");

        int size = sc.nextInt();

        System.out.println("Enter the elements into linked list: ");

        for(int i = 0; i < size; i++){
          llist.push(sc.nextInt());
        }
        /* Created Linked List 1->2->3->4->5 */
        /*llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);*/

        System.out.println("Linked List before calling pairWiseSwap() ");
        llist.printList();

        llist.pairWiseSwap();

        System.out.println("Linked List after calling pairWiseSwap() ");
        llist.printList();
    }
}
