package Day7Assignment;

public class NodeTail {
    int data;
    NodeTail next;
    //Constructor to create a new node
    public NodeTail(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    NodeTail head;
    //Method to insert a new node at the end of the linked list
    public void insertAtTail(int data){
        NodeTail newNode = new NodeTail(data);

        if(head == null){
            head = newNode;
        }else{
            NodeTail current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display(){
        NodeTail current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        int[] data = {141, 302, 164, 530, 474};
        for (int value : data){
            list.insertAtTail(value);
        }
        list.display();
    }
}

