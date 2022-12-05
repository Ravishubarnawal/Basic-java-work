public class ConstructorWork2 {
    public static void main(String[] args) {
            Phone m1= new Phone("realme8","oppo", 27999.0);



        }
    }
    class Phone {
    //properties
        String name;
        String Brand;
        double price;
        //constructor
        Phone (String name, String Brand, Double price){
            this.name=name;
            this.Brand=Brand;
            this.price=price;
            System.out.println("I  am constructor");
            System.out.println("Name is:"+name);
            System.out.println("Brand is:"+Brand);
             System.out.println("Price is:"+price);
            method();

        }
       void method()
       {
           System.out.println("Call me");
       }

}
