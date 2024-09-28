package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list =new LL();

        list.insertFirst(12);
        list.insertFirst(13);
        list.display();
        list.insertLast(14);
        list.display();
        list.insert(16,2);
        list.display();
//        list.deleteFirst();
//        list.deleteLast();
//        list.display();
        list.delete(2);
        list.display();
    }
}
