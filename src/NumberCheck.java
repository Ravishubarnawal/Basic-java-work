import java.sql.SQLOutput;
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num+ " "+ "Number is positive");
        }
        else if (num<0){
            System.out.println(num+" "+ "Number is Negative");
        }
        else{
            System.out.println(num+ " "+ "Number is zero");
        }
    }
}
