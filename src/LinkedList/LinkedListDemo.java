package LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        Node head = new Node(1);

        Node secondNode = new Node(2);

        Node thirdNode = new Node(3);

        Node fourthNode = new Node(4);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        Node temp =head;

        while (temp.next !=null) {

            System.out.println(temp.data);
            temp =temp.next;
        }

        System.out.println(temp.data);



    }
}


