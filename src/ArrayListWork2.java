import java.util.ArrayList;
import java.util.*;

public class ArrayListWork2 {
    public static <iterator> void main(String[] args) {
        //Creating user-defined class objects
        student s1=new student(101,"Sonoo",23);
        student s2=new student(102,"Ravi",21);
        student s3=new student(103,"Vishal",25);
        ArrayList<student> al=new ArrayList<student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);

        Iterator<student> itr= al.iterator();

        for (Iterator<student> it = itr; it.hasNext(); ) {
            student value = it.next();
            System.out.println(value.rollno+" "+value.name+" "+value.id);




        }





    }
}
class student {
    int id;
    String name;
    int rollno;
    student(int id, String name, int rollno){
        this.id=id;
        this.name=name;
        this.rollno=rollno;
    }


}