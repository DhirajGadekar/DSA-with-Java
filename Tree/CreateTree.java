import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {

        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class CreateTree {

    static Scanner sc;
    Node createTree() {

        Node root = null;
        System.out.println("Enter Data in Node : ");
        int data = sc.nextInt();
        if(data == -1) return null;
        
        root = new Node(data);
        
        System.out.println("Enter left Node for : " + data);
        root.left = createTree();

        System.out.println("Enter right Node fot : " + data);
        root.right = createTree();

        return root;
    }
    void inorder(Node root) {

        if(root == null) return;
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    void preorder(Node root) {

        if(root == null) return;
        
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root) {

        if(root == null) return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        CreateTree ct = new CreateTree();
        Node root = ct.createTree();
        System.out.print("Inorder : ");
        ct.inorder(root);
        System.out.println();

        System.out.print("Preorder : ");
        ct.preorder(root);
        System.out.println();

        System.out.print("Postorder : ");
        ct.postorder(root);
        System.out.println();
    }
}