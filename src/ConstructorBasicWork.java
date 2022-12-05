public class ConstructorBasicWork {
    public static void main(String[] args) {
        Mobile m1= new Mobile();// no calling is done constructor run itself once.

    }
}
class Mobile{
    String name;
    String Brand;
    Double price;
    //constructor
    Mobile(){
        System.out.println("I  am constructor");

    }
}
