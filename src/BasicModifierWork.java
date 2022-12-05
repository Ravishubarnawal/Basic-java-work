public class BasicModifierWork {
    public static void main(String[] args) {
            Soundtrack s1= new Soundtrack(2500.9,"boat","blaster");
            Soundtrack s2= new Soundtrack(4700.8,"mi","dreamer");
            System.out.println(s1.price);// this is showing error becz class props is private.
            System.out.println(s2.price);
            System.out.println(s2.Brand);
            s2.getInformation();

        }
    }
    class Soundtrack{
   protected double price;
    String Brand;
    String name;
        Soundtrack(double price,String Brand, String name){
            this.price=price;
            this.Brand=Brand;
            this.name=name;

        }
        void getInformation(){
            System.out.println("Price is:"+price);
            System.out.println("Brand is:"+Brand);
            System.out.println("Name is:"+name);  




        }

    }

