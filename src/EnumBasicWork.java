enum Gender { Male,Female,Others}
public class EnumBasicWork {
    public static void main(String[] args) {
        Human H1=new Human();
        H1.gender=Gender.Female; // we can use fixed value declare in variable Gender
        H1.name="Babita";
        System.out.println(H1.gender);


    }
}
class Human{
    String name;
    Gender gender;
}
