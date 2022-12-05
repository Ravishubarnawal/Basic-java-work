public class MethodOverridingSuperWork {
    public static void main(String[] args) {
        shape s1= new square();
        s1.draw();
        // the method in super class become useless it's not abstract.
        //solution to run super class with same name in subclass is "super" keyword.

    }

}
class shape{
    void draw(){

        System.out.println("Can't define the shape");

    }
}
class square extends shape{
    void draw(){
        System.out.println("This is square shape");
        super.draw();// this helps to run both the methods od sub and super class.
    }
}
