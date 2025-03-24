// // WE CAN CREATE LINKED LIST FROM SKRETCH

// class Node {
//   int data;
//   Node next;
//   // Constructor to create a new node
//   public Node(int data) {
//       this.data = data;
//       this.next = null;
//   }
// }

// class LinkedList {
//   Node head; // Head of the list

//   // Constructor to create an empty linked list
//   public LinkedList() {
//       head = null;
//   }

//   // Method to add a node at the end
//   public void append(int data) {
//       Node newNode = new Node(data);

//       // If the list is empty, make the new node the head
//       if (head == null) {
//           head = newNode;
//           return;
//       }

//       // Traverse to the end of the list
//       Node temp = head;
//       while (temp.next != null) {
//           temp = temp.next;
//       }

//       // Add the new node at the end
//       temp.next = newNode;
//   }

//   // Method to print the linked list
//   public void printList() {
//       Node temp = head;
//       while (temp != null) {
//           System.out.print(temp.data + " ");
//           temp = temp.next;
//       }
//       System.out.println();
//   }

//   // Method to delete the first occurrence of a value
//   public void delete(int key) {
//       // If the list is empty
//       if (head == null) return;

//       // If the head node contains the key
//       if (head.data == key) {
//           head = head.next;
//           return;
//       }

//       // Find the previous node of the node to be deleted
//       Node temp = head;
//       while (temp != null && temp.next != null) {
//           if (temp.next.data == key) {
//               temp.next = temp.next.next;
//               return;
//           }
//           temp = temp.next;
//       }
//   }
// }


// class LinList{
//   public static void main(String[] args) {
//     LinkedList list = new LinkedList();
        
//     // Add elements to the list
//     list.append(10);
//     list.append(20);
//     list.append(30);
//     list.append(40);
    
//     // Print the list
//     System.out.print("Linked List: ");
//     list.printList();

//     // Delete an element
//     list.delete(30);
//     System.out.print("After deletion: ");
//     list.printList();
//   }
// }






// USING BUILT IN METHODS OF JAVA

import java.util.LinkedList;

class LinList{
  public static void main(String[] args) {
    LinkedList<String> arr=new LinkedList<>();
    arr.add("Ritesh");
    arr.add("Amit");
    arr.add("Suraj");

    System.out.println(arr);
  }
}