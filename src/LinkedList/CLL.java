package LinkedList;

public class CLL {
        private Node head;
        private Node tail;
        private int size;


        public void insert(int val) {

            Node node = new Node(val);

            if(head ==null){
                head = node;
                tail = node;
                size++;
                return;
            }

            tail.next = node;
            node.next=head;
            tail = node;

            size++;
        }


    public void deleteNode(int val) {

        Node node = head;

        if (node == null) {
            return;
        }

        if (val == node.data) {

            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        do {
            Node n = node.next;
            if (n.data == val) {
                node.next = n.next;
                if (n == tail) {
                    tail = node;
                }

                size--;
                break;
            }
                node = node.next;

        } while (node != head) ;



    }



        public void display() {

            Node temp =head;

            if(temp !=null){
                do {
                    System.out.print(temp.data + "-->");
                    temp = temp.next;
                }
                while (temp != head);
                System.out.print("HEAD");

                System.out.println();
                System.out.println("Head-->" + head.data + ", Tail -->" + tail.data + ", Size : " + size );
            }


        }

        private class Node {

            private int data;
            private Node next;

            public Node(int data){
                this.data=data;
            }

            public Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

}
