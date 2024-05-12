import java.util.*;

class LearnTreeSet {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");
        // You may want to comment out the following two lines to avoid exceptions.
        // t.add(new Integer(101)); // This will throw a ClassCastException
        // t.add(null); // This will throw a NullPointerException
        System.out.println(t);
    }
}
