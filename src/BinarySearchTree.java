class Node {
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class OperationBST{
    Node root;

    public OperationBST(){
        root = null;
    }

    void insert(int key){
        root = insertRec(root,key);
    }

    Node insertRec(Node root,int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if (key < root.data){
            root.left = insertRec(root.left,key);
        }else if (key > root.data){
            root.right = insertRec(root.right,key);
        }return  root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        OperationBST bst = new OperationBST();

        int[] arr = {15, 17, 12, 4, 17, 9, 2, 20, 21, 27};
        for(int num : arr){
            bst.insert(num);
        }
        System.out.println("Isi Binary Search Tree: ");
        bst.inorder();
    }
}
