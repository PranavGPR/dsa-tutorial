package Hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(6, "a");
        table.put(8, "b");
        table.put(11, "c");
        table.put(6, "a++");
        table.remove(60);
        System.out.println(table.get(6));
    }
}