public class StaticKeywordWork {
    public static void main(String[] args) {
        //Charger c1=new Charger();
        //c1.info="Mi 33w";
        Charger.info="Mi 33w"; //static keyword used properties and method inside class
        //can be used without creating object just by classname.returntype="";
        System.out.println(Charger.info);
        Database.getInfo("localhost");

    }
}
class Charger{
    static String info;
}
class Database{
    //static method
        static void getInfo(String value) {
            // return "localhost";
            // }
        }
}