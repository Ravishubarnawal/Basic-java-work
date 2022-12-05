public class AbstractTesting {
    public static void main(String[] args) {
        car caref =new BMWCar();
        caref.run();
        caref = new HyundaiCar();
        caref.run();
    }

}

abstract class car{
    abstract void run();

}
class BMWCar extends car{
    void run (){
        System.out.println("BMW Car runs smoothly...");
    }
}
class HyundaiCar extends car{
    void run (){
        System.out.println("Hyundai Car runs smoothly and fast...");
    }
}

