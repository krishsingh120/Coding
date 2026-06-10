
class Node {
  Node links[] = new Node[26];

  int ew = 0;
  int cp = 0;

  public boolean containsKey(char ch) {
    return links[ch - 'a'] != null;
  }

  public Node get(char ch) {
    return links[ch - 'a'];
  }

  public void set(char ch, Node node) {
    links[ch - 'a'] = node;
  }

  public void increaseEnd() {
    ew++;
  }

  public void increasePrefix() {
    cp++;
  }

  public void deleteEnd() {
    ew--;
  }

  public void reducePrefix() {
    cp--;
  }

  public int getEnd() {
    return ew;
  }

  public int getPrefix() {
    return cp;
  }

}

public class Tries2 {

  public Node root;

  public Tries2() {
    root = new Node();
  }

  public void insert(String word) {

    Node node = root;

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);

      if (!node.containsKey(ch)) {
        node.set(ch, new Node());
      }

      node = node.get(ch);
      node.increasePrefix();

    }

    node.increaseEnd();

  }

  public int countWordEqualTo(String word) {
    Node node = root;

    for (int i = 0; i < word.length(); i++) {

      char ch = word.charAt(i);

      if (!node.containsKey(ch)) {
        return 0;
      }

      node = node.get(ch);
    }

    return node.getEnd();
  }

  public int countWordStartingWith(String word) {
    Node node = root;

    for (int i = 0; i < word.length(); i++) {

      char ch = word.charAt(i);

      if (!node.containsKey(ch)) {
        return 0;
      }

      node = node.get(ch);
    }

    return node.getPrefix();
  }

  public void erase(String word) {

    Node node = root;

    if (countWordEqualTo(word) == 0)
      return;

    for (int i = 0; i < word.length(); i++) {

      char ch = word.charAt(i);

      if (!node.containsKey(ch)) {
        return;
      }

      node = node.get(ch);
      node.reducePrefix();
    }

    node.deleteEnd();

    return;
  }

  public static void main(String[] args) {
    Tries2 trie = new Tries2();

    trie.insert("apple");
    trie.insert("apple");
    trie.insert("apps");
    trie.insert("apps");
    trie.insert("abc");
    trie.insert("ap");

    System.out.println();

    System.out.println(trie.countWordEqualTo("apple"));
    System.out.println(trie.countWordEqualTo("apps"));
    System.out.println(trie.countWordEqualTo("abc"));
    System.out.println(trie.countWordEqualTo("ap"));

    System.out.println();

    System.out.println(trie.countWordStartingWith("ap"));
    System.out.println(trie.countWordStartingWith("app"));
    System.out.println(trie.countWordStartingWith("abc"));
    System.out.println(trie.countWordStartingWith("z"));
  }
}
