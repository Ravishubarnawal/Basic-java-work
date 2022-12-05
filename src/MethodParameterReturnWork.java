public class MethodParameterReturnWork {
    public static void main(String[] args) {
        getName();
        add();
        SI(5000,5,10);
    }
    public  static void getName(){
        System.out.println("My name is Ravishu");
    }
    public static void add(){
        int num1= 10;
        int num2 = 20;
        int sum=num1+num2;
        System.out.println(sum);
        String name =getMayorName();
        System.out.println(name);
        int result= add(15,25);
        System.out.println(result);
        String name1= getName("Ravishu","Barnawal");
        System.out.println(name1);

    }
    public static void SI(int P, int T, int R){

        int interest= (P*T*R)/100;
        System.out.println(interest);
    }
    public static String getMayorName(){
        return "Balen shah";

    }
    public static int add(int a, int b){
        return a+b;
    }
    public static String getName(String fname,String lname){
        return fname+ " "+lname;
    }
}
