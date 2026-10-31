import java.util.ArrayList;

public class HashST<Key, Value> {

    private int m = 1024;

    private Node[] lists;

    private class Node {
        Key key;
        Value val;
        Node next;

        Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    @SuppressWarnings("unchecked")
    public HashST() {
        lists = (Node[]) java.lang.reflect.Array.newInstance(Node.class, m);

    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % m;
    }


    public Value get(Key key) {
        int i = hash(key);

        for (Node x = lists[i]; x != null; x = x.next) {
            if (key.equals(x.key)) {
                return x.val;
            }
        }

        return null;
    }

    public void put(Key key, Value val) {
        int i = hash(key);

        for (Node x = lists[i]; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }

        lists[i] = new Node(key, val, lists[i]);
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public int size() {
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (Node x = lists[i]; x != null; x = x.next) {
                count++;
            }
        }

        return count;
    }

    public Iterable<Key> keys() {
        ArrayList<Key> allKeys = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (Node x = lists[i]; x != null; x = x.next) {
                allKeys.add(x.key);
            }
        }

        return allKeys;
    }

    public static void main(String[] args) {
        HashST<String, Integer> table = new HashST<>();

        table.put("Apple", 10);
        table.put("Banana", 20);
        table.put("Cherry", 30);

        System.out.println("Contains Apple: " + table.contains("Apple"));
        System.out.println("Contains Orange: " + table.contains("Orange"));
        System.out.println("Size: " + table.size());
        System.out.println("Keys: " + table.keys());
    }
}

