public class InterfaceWork {
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.buy();
        b1.run();

    }

}
interface Vechile{
    void run();//abstract method

}
interface Clothes{
    void buy();
}
class Bike implements Vechile,Clothes{ //multiple inheritance

    @Override
    public void run() {
        System.out.println("Runs on 2 wheels");

    }
    @Override
    public void buy() {
        System.out.println("Bulk purchase is difficult to store");

    }
}
class Car implements Vechile,Clothes{

    @Override
    public void run() {
        System.out.println("Runs on 4 wheels");

    }
    @Override
    public void buy() {
        System.out.println("Bulk purchase is easy to store");

    }
}