package AssessmentDS;
import java.util.*;

public class Node {
    int data;
    Node next; //reference to the next node

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head; //reference to the first node(head)

    public LinkedList(){

        this.head = null;
    }
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void removeAtIndex(int index){
        if(head == null){
            System.out.println("The List is empty");
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node currentNode = head;
        Node previousNode = null;
        int currentIndex = 0;

        while(currentNode != null && currentIndex < index){
            previousNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }
        if(currentNode == null){
            System.out.println("Index out of bounds");
            return;
        }
        previousNode.next = currentNode.next;
    }
    public void printList(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList lList = new LinkedList();
        System.out.println("Enter 4 elements:");
        for(int i=0; i<4; i++){
            System.out.println("Element " + (i+1) + ": ");
            int data = sc.nextInt();
            lList.append(data);
        }
        System.out.println("Initial Linked List:");
        lList.printList();

        System.out.println("Enter the index of the element to remove(0-3): ");
        int indexToRemove = sc.nextInt();
        lList.removeAtIndex(indexToRemove);

        System.out.println("After removal of LinkedList: ");
        lList.printList();
    }
}

