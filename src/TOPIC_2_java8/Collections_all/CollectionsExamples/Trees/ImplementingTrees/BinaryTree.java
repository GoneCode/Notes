package CollectionsExamples.Trees.ImplementingTrees;

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root=null;
    }

    public void add(int value){
        root = addRecursive(root,value);
    }

    private Node addRecursive(Node current,int value){
        if(current==null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = addRecursive(current.left,value);
        }else if(value>current.value){
            current.right = addRecursive(current.right,value);
        }
        return current;
    }

    public static void inOrderTraversal(Node node){
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.print(node.value+" ");
            inOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(Node node){
        if(node!=null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value+" ");
        }
    }

    public static void preOrderTraversal(Node node){
        if(node!=null){
            System.out.print(node.value+" ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
        inOrderTraversal(tree.root);
        System.out.println(" ");
        postOrderTraversal(tree.root);
        System.out.println(" ");
        preOrderTraversal(tree.root);


    }




}
