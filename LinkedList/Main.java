package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        // list.addLast(20);
        // list.addLast(30);
        list.print();
        list.removeFirst();
        list.print();
        // System.out.println(list.contains(30));
    }
}
