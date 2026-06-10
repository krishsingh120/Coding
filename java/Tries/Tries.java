

class Node {
  Node links[] = new Node[26];
  boolean flag;

  public boolean containsKey(char ch) {
    return links[ch - 'a'] != null;
  }

  public Node get(char ch) {
    return links[ch - 'a'];
  }

  public void set(char ch, Node node) {
    links[ch - 'a'] = node;
  }

  public void setEnd() {
    flag = true;
  }

  public boolean isEnd() {
    return flag;
  }
}

public class Tries {

  public static Node root;

  public Tries() {
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
    }

    node.setEnd();
  }

  public boolean search(String word) {
    Node node = root;

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);

      if (!node.containsKey(ch)) {
        return false;
      }

      node = node.get(ch);
    }

    return node.isEnd();
  }

  public boolean startsWith(String word) {
    Node node = root;

    for (int i = 0; i < word.length(); i++) {

      char ch = word.charAt(i);

      if (!node.containsKey(ch)) {
        return false;
      }

      node = node.get(ch);
    }

    return true;
  }

  /**
   * @param args
   * 
   * 
   *             Tries DS contains:
   *             two data member -> int arr of size 26 and boolean flag
   *             abd tries constructor
   * 
   * 
   *             So node look like this
   *             class Trie {
   *             Node arr[26];
   *             boolean flag;
   *             }
   * 
   *             1. every node consist these two data members.
   * 
   * 
   *             2. In Tries there are some imp pre implement function needed for
   *             production level code.
   * 
   *             3. Pre implemented functions:
   *             - containsKey()
   *             - getLink()
   *             - setLink()
   *             - setEnd()
   *             - isEnd()
   */

  public static void main(String[] args) {
    Tries trie = new Tries();

    trie.insert("apple");

    System.out.println(trie.search("apple")); // true
    System.out.println(trie.search("app")); // false
    System.out.println(trie.startsWith("app"));// true
  }
}
