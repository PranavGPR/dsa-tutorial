package Hashtable;

public class Main {
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        var ch = finder.firstRepeatedChar("a green apple");
        System.out.println(ch);
    }
}