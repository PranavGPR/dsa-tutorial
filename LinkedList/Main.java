package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        System.out.println(list.size());
        list.addLast(20);
        System.out.println(list.size());
        list.addLast(30);
        System.out.println(list.size());
        list.addFirst(30);
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.size());
        list.removeFirst();
        System.out.println(list.size());
    }
}
