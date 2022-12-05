public class RecursionWork
{
    public static void main(String[] args) {
       int  result = sum(3);
        System.out.println("Total is:"+result);

    }
    public  static int sum(int a) {
        if (a > 0) {
            return a + sum(a - 1);

        }
        else {
            return 0;
        }


    }
}
