package Day7Assignment;
import java.util.*;

public class NodePosition {
    int data;
    NodePosition next;

    public NodePosition(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedListPosition {
    NodePosition head;
    public void insertAtPosition(int data, int position){
        NodePosition newNode = new NodePosition(data);
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        NodePosition current = head;
        int currentPosition = 0;
        while(current != null && currentPosition < position - 1){
            current = current.next;
            currentPosition++;
        }
        if(current != null){
            newNode.next = current.next;
            current.next = newNode;
        }
        else{
            System.out.println("Position out of bonds. ");
        }
    }
    public void display(){
        NodePosition current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
class PositionMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data to insert : ");
        int data = sc.nextInt();
        System.out.print("Enter the position to insert the node : ");
        int position = sc.nextInt();
        LinkedListPosition list = new LinkedListPosition();
        list.insertAtPosition(16, 0); //Inserting 16 at position 0
        list.insertAtPosition(13, 1);
        list.insertAtPosition(7, 2);
        //Inserting 1 at position 2
        list.insertAtPosition(data, position);
        list.display();
    }
}
