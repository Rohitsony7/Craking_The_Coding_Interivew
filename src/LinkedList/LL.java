package LinkedList;

import java.util.Scanner;

public class LL {


    private Node head;
    private Node tail;
    private int size; // 0

    public LL() {
        this.size = 0;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.value + "-->");

            temp = temp.next;
        }

        System.out.println("END");


        System.out.println("Head-->" + head.value + " ,Tail -->" + tail.value);
        System.out.println();


    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
//       first node is being added here
        if (tail == null) {

            tail = node;
        }

        size += 1;

    }

    public void insertLast(int val){
       if(tail == null){
          insertFirst(val);
          return;
       }
       Node node = new Node(val);
       tail.next = node;
       tail =node;
       size += 1;
    }

    public void insertAtIndex(int val, int index){

        if(index ==0) {

            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;

        }


        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(val, temp.next);
        temp.next = node;
    }

    public int deleteFirst(){

        int value = head.value;

        head = head.next;

        //if there were only single value 5-> null, need to update the tail
        if(head ==null) tail = null;

        size--;
        return value;

    }

    public int deleteLast(){

        if(size <=1) deleteFirst();

        Node secondLast = getNode(size-2); //get me the second last pointer
        int val = tail.value;
        tail = secondLast;
        tail.next=null;
        size--;

        return val;


    }

    public int deleteAtIndex(int index){

        if(index ==0) {
           return deleteFirst();

        }

        if(index == size-1 ){
            return deleteLast();
        }

        Node prev = getNode(index-1);

        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;



    }


    public Node getNode(int index){

        Node node = head;

        for (int i = 0; i < index; i++) {

            node = node.next;

        }

        return node;



    }

    //delete dupicate
    public void deleteDuplicate(){

        Node node = head;
        if(node ==null) return;

        while(node.next !=null){

            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;

            }else {
                node = node.next;
            }
        }



    }




    private class Node {
        private int value;
        private Node next;

        public Node(int value) {

            this.value = value;

        }

        public Node(int value, Node next) {

            this.value = value;
            this.next = next;

        }

    }
}
