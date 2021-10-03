package Trie;

public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("car");
        trie.insert("care");
        trie.insert("card");
        trie.insert("careful");
        trie.insert("egg");
        var words = trie.findWords("car");
        System.out.println(words);
    }
}
