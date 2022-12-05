import java.util.Collections;
import java.util.LinkedList;

public class LinklistWork {
    public static void main(String[] args) {
        LinkedList <String > names =new LinkedList<>();
        names.add("Milan");
        names.add("Naresh");
        names.add("Kanchan");
        names.add("Himal");
        names.add("Rahul");
        names.addFirst("Kamla");// like  to update list with new entry
        names.getFirst();// to get first item of  the list.
        System.out.println(names.getFirst());
        Collections.sort(names); // at last sorted alphabetically.
        System.out.println(names);
    }
}
