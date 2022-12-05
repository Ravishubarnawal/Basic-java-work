public class InheritanceWork {
    public static void main(String[] args) {
        son s1= new son();
        s1.name="Rohit";
        s1.age= 28;
        s1.rollno=45;
        s1.PrintFatherInfo();
        Father f=new Father();

    }

}
class Father{
    //properties
    String name;
    int age;
    //methods
    void PrintFatherInfo()
    {
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);

    }

}
class son extends Father{
    int rollno;
    void printsoninfo()
    {
        System.out.println("Roll no"+rollno);
    }

        }