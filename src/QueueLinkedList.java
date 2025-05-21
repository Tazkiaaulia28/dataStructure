class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class QueueLinked{
    Node front, rear;

    public QueueLinked(){
        this.front = this.rear = null;
    }

    void  enqueue(int value){
        Node newNode = new Node(value);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if(front == null){
            return -1;
        }
        int number = front.value;
        front = front.next;
        if(front == null) rear = null;
        return number;
    }

    void display(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class QueueLinkedList {
    public static void main(String[] args) {
        int [] arr = {39,88, 102, 64, 128, 113, 124, 248, 46, 39,
                92, 117, 184, 351,52, 60, 104, 77, 208, 94
        };

        QueueLinked queue = new QueueLinked();
        QueueLinked temp = new QueueLinked();

        for(int num : arr){
            queue.enqueue(num);
        }

        while(queue.front != null){
            int number = queue.dequeue();
            if(number != 92){
                temp.enqueue(number);
            }
        }
        for(int num : arr){
            queue.enqueue(num);
        }
        System.out.println("Queue before delete number 92 is:");
        queue.display();
        System.out.println("Queue after delete number 92 is:");
        temp.display();
    }

}
