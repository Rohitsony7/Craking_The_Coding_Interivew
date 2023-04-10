package LinkedList;

public class Main {

    public static void main(String[] args) {

        LL linkedList = new LL();
        linkedList.insertFirst(5);
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);


        linkedList.insertAtIndex(77,2 );


        linkedList.display();

        System.out.println("Deleted first no " + linkedList.deleteFirst());
        linkedList.display();

        System.out.println("delete last no " + linkedList.deleteLast());
        linkedList.display();

        System.out.println("delete at index(1) no is : " + linkedList.deleteAtIndex(1));
        linkedList.display();


        DLL dl = new DLL();
//        dl.insertFirst(1);
//        dl.insertFirst(2);
//        dl.insertFirst(3);
//        dl.insertFirst(4);


//        dl.display();
//        dl.displayReverse();

//        dl.insertLast(77);
//        dl.insertLast(78);
//        dl.insertLast(79);
//
//        dl.insertAfterNode(79, 788);
//
//
//        dl.display();

        LL cl = new LL();

        cl.insertLast(1);
        cl.insertLast(1);
        cl.insertLast(2);
        cl.insertLast(3);
        cl.insertLast(4);
        cl.insertLast(4);
        cl.insertLast(4);

        cl.display();
        cl.deleteDuplicate();
        cl.display();

    }
}
