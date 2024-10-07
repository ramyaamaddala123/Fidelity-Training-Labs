package Day7Assignment;

public class NodeTraversal {
    int data;
    NodeTraversal left, right;

    public NodeTraversal(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree{
    //preorder traversal method
    public void preOrder(NodeTraversal root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
class TraversalMain{
    public static void main(String[] args){
        //Creating a sample tree from the given input
        NodeTraversal root = new NodeTraversal(1);
        root.right = new NodeTraversal(2);
        root.right.right = new NodeTraversal(5);
        root.right.right.left = new NodeTraversal(3);
        root.right.right.left.right = new NodeTraversal(4);
        root.right.right.right = new NodeTraversal(6);
        // Creating a BinaryTree object
        BinaryTree tree = new BinaryTree();
        //Calling the preOrder function to print the preOrder  traversal
        tree.preOrder(root);
    }
}

