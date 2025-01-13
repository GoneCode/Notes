package CollectionsExamples.LinkedListExamples;

public class LinkedListOwnImpl {

    public static class Node {

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node insertAtBeginning(Node head,int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head=newNode;
        return head;
    }

    public static void traverseLinkedList(Node head){

        Node current = head;
        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static boolean searchLinkedList(Node head,int target){
        while(head!=null){
            if(head.data==target){
                return true;
            }
            head=head.next;
        }
        return false;
    }


    public static void main(String[] args) {
        Node linkedlist = new Node(1);
        linkedlist=insertAtBeginning(linkedlist,10);
        linkedlist=insertAtBeginning(linkedlist,20);
        linkedlist=insertAtBeginning(linkedlist,30);
        traverseLinkedList(linkedlist);
        System.out.println(searchLinkedList(linkedlist,10));

    }

}
