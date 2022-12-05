import org.w3c.dom.ls.LSOutput;

public class AbstractWork {
    public static void main(String[] args) {
        Uttrakhand u1=new Uttrakhand();
        u1.cities=97;
        u1.cities=12;
        u1.degree=76;
        System.out.println(u1.cities);
        Bihar b1 = new Bihar();
        b1.cities = 7;
        b1.population=250000000;
        b1.degree=73;
        System.out.println(b1.population);

    }

}
abstract  class India {
    int cities;

    void cities() {
        System.out.println("No of cities:" + cities);
    }

    abstract void climate();

}

class Uttrakhand extends India{//concrete class
     int degree;
    @Override
    void climate() {
        System.out.println("Climate of Uttrakhand:"+degree);
    }
    void cities(){
        System.out.println("No.of cities in Uttrankhand:"+cities);
    }



}
class Bihar extends India{
    int degree;
    int population;

    @Override
    void climate() {
        System.out.println("Climate of Bihae"+degree);
        System.out.println("Population of Bihae:"+population);
    }

}




