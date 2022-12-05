import java.util.Scanner;

public class TryCatchBasicWork {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //We can kosis(try) all this code in try block eg:
        try {

            System.out.println("Enter first number");
            int n1 = sc.nextInt();
            System.out.println("Enter second number");
            int n2 = sc.nextInt();
            int sum = n1 + n2;
            System.out.println(sum);
        }
        catch (Exception e){
            System.out.println("Please  only enter integer value");
        }


    }

    }

