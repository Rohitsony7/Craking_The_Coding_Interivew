package LinkedList;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size=0;
    }



    public void insertFirst(int value){



        Node node = new Node(value);

        if(head ==null){

            head = node;
            tail =node;
            size++;
            return;
        }

        node.next= head;
        head.prev = node;
        head= node;
        size++;

    }

    public void  insertLast(int val){

        Node node = new Node(val);

        if(head ==null){

           this.insertFirst(val);
           return;

        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        tail.next = null;
    size++;

    }

    public void display(){

        Node temp = head;

        System.out.print("Start-->");
        while(temp !=null){
            System.out.print(temp.value + "<--->");
            temp = temp.next;
        }
        System.out.println("End");

        if(head !=null && tail !=null) {
            System.out.println("Head-->" + head.value + " ,Tail -->" + tail.value);
        }
        System.out.println();

    }

    public void displayReverse(){

        Node temp = tail;

        System.out.print("END");
        while (temp !=null){

            System.out.print("<--->"+temp.value );
            temp = temp.prev;
        }
        System.out.print("--->start");
        System.out.println();


    }

    public Node find(int value){

        Node node = head;

        while (node !=null){
            if(node.value ==value) {
                return node;
            }

            node = node.next;
        }

        return null;

    }

    public void insertAfterNode(int after, int val){

         Node p = find(after);

         if(p ==null){
             System.out.println("does not exists..");
             return;
         }

         Node node = new Node(val);
        if(p.next ==null) tail = node;

            node.next = p.next;
            if(p.next !=null){
                p.next.prev = node;
            }

            p.next = node;
            node.prev= p;



    }



    private class Node{

        private int value;
        private Node next;
        private Node prev;

        public Node(int value){

            this.value = value;

        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
