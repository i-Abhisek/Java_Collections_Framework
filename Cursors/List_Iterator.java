import java.util.*;

class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Abhisek");
        l.add("Ram");
        l.add("Abhi");
        l.add("nag");
        System.out.println(l);
        ListIterator<String> itr = l.listIterator();
        while(itr.hasNext()) {
            String s = itr.next();
            if(s.equals("Ram")) {
                itr.remove();
            } else if(s.equals("nag")) {
                itr.add("Chintu");
            } else if(s.equals("Abhi")) {
                itr.set("Chintu");
            }
        }
        System.out.println(l);
    }
}
