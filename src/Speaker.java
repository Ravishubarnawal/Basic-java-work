public class Speaker {
    private double price; // private access to only same class see above:
    String Brand;
    String name;

    Speaker(double price, String Brand, String name) {
        this.price = price;
        this.Brand = Brand;
        this.name = name;

    }

    void Information() {
        System.out.println(" Price is:" + price);
        System.out.println(" Brand is:" + Brand);
        System.out.println(" Name  is:" + name);
    }


}
