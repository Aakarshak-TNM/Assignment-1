import java.util.HashSet;

class Hash_set {
    HashSet<String> set = new HashSet<>();

    HashSet<String> create() {
        set = new HashSet<>();
        return set;
    }

    void add(String str) {
        set.add(str);
    }

    void delete(String str) {
        set.add(str);
    }

    boolean check(String str) {
        return set.contains(str);
    }

    void print() {
        System.out.println(set);
    }

    void print(boolean check) {
        System.out.println(check);
    }
}

public class Sets {
    public static void main(String[] args) {
        Hash_set set = new Hash_set();
        set.create();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.print();

        set.check("A");
        set.print(set.check("A"));
    }
}
