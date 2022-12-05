public class Classwork {
    public static void main(String[] args) {
        House h1 =new House();
        House h2 =new House();
        h1.price= 200000;
        h2.color="Blue";
        h2.properties();
        h1.properties();
    }
}
class House{
    //Properties
    String color;
    double price;
    String location;
    //fus/Methods creation
    void properties()

    {
        System.out.println("Color of House is:" +this.color);
        System.out.println("Price of House is:" +this.price);
    }


    }




