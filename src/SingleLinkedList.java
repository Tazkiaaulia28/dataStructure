class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;
//A
    public void insertAtTail(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
 //B

    public void insertAmong(int value, int target){
        Node temp = head;
        while (temp!=null && temp.value != target){
            temp = temp.next;
        }
        if(temp != null){
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
        }else {
            System.out.println("Number "+target+" not found.");
        }
    }
//C
   public void delete (int value){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        if (head.value == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next !=null && temp.next.value != value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }else {
            System.out.println("Number "+value+" not found.");
        }
   }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        int[] arr = {100, 12, 70, 24, 40, 36, 16, 35, 14, 30, 25, 43, 5, 9, 42, 6, 11, 41, 7, 13};
        for (int number :arr){
            list.insertAtTail(number);
        }
//A. Insert semua angka
        System.out.println("Linked List is:");
        list.display();
//B. Insert angka 32 setelah angka 30
        list.insertAmong(32,30);
        System.out.println("\nLinked List insert 32 after 30 is:");
        list.display();
//C. delete angka 42
        list.delete(42);
        System.out.println("\nLinked List after delete 42 is:");
        list.display();

    }
}

