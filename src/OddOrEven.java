import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num  = sc.nextInt();
        //System.out.println(num);
        if(num%2==0) {
            System.out.println(num + "No is even");
        }
            else{
                System.out.println(num+"No is odd");
            }

        System.out.println("\n");


    }
}
