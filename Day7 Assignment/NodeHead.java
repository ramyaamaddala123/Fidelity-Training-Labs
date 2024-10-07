package Day7Assignment;

public class NodeHead {
    int data;
    NodeHead next;

    public NodeHead(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedListHead{
    NodeHead head;
    public void insertAtHead(int data){
        NodeHead newNode = new NodeHead(data);
        newNode.next = head;
        head = newNode;
    }
    public void display(){
        NodeHead current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
class HeadMain{
    public static void main(String[] args){
        LinkedListHead list = new LinkedListHead();
        int[] data = {383, 484, 392, 975, 321};
        for(int value : data){
            list.insertAtHead(value);
        }
        list.display();
    }
}