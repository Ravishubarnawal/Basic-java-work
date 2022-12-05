import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListWork {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Milan");
        names.add("Naresh");
        names.add("Kanchan");
        names.add("Himal");
        names.add("Rahul");

        names.get(3);
        names.set(0,"Vishal");
        names.get(0);
        //sort values(names)
        Collections.sort(names);// this will sort the names alphabetically
       Collections.sort(names,Collections.reverseOrder());//to reverse sort order.
        for (String value:names)
             {
                 System.out.println(value);

        }
    }
}
