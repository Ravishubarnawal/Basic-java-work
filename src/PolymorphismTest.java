import jdk.swing.interop.SwingInterOpUtils;

public class PolymorphismTest {
    public static void main(String[] args) {
        Vehicle v1 =new MotorBike();// It see motarbike class is called so it runs first.
        v1.move();
         v1=new Vehicle();// It se vehicle call is called so it runs.
        v1.move();

    }
}
class Vehicle{
    public void move(){
        System.out.println("Vehicles can move");

    }
}

class MotorBike extends Vehicle{
    public void move(){
        System.out.println("MotorBike can move and accelerate too!!”");
    }
}

