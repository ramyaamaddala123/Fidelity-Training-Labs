package Day7Assignment;

public class NodeReverse {
    int data;
    NodeReverse next;

    public NodeReverse(int data){
        this.data = data;
        this.next = null;
    }
}
class ReverseLinkedList {
    NodeReverse head;
    public void insertAtTail(int data) {
        NodeReverse newNode = new NodeReverse(data);
        if (head == null) {
            head = newNode;
        } else {
            NodeReverse current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void reverse(){
        NodeReverse prev = null;
        NodeReverse current = head;
        NodeReverse next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void display(){
        NodeReverse current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
class ReverseMain{
    public static void main(String[] args){
        ReverseLinkedList list = new ReverseLinkedList();
        //original Linked List
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        //Reverse the linked list
        list.reverse();
        list.display();
    }
}
