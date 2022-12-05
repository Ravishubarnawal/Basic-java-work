import java.util.Scanner;
public class   CalculatorWork {
    public static void main(String[] args) {

        int  result;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Choose  the operator: +,-,* or /");
        char operator = sc.next().charAt(0);
        switch (operator) {

            // performs addition between numbers
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;

            // performs subtraction between numbers
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;

            // performs multiplication between numbers
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;

            // performs division between numbers
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }


    }
}



