public class MethodOverloadingWork {
    public static void main(String[] args) {
        add(10.2,3.0); //which method is called is decided by matching the parameters
       // with respective method
    }
    public static void  add(int a,int b){
       int sum=a+b;
        System.out.println(sum);
    }//Many methods with same name but diff parameter
    public static void  add(int a,int b,int c) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static void  add(double a,double b) {
        double sum = a + b;
        System.out.println(sum);
    }
}

