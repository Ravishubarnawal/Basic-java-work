import java.util.Scanner;
public class AlphabetTest {
    public static void main(String[] args) {
        char a;
        char e;
        char i;
        char  o;
        char u;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char");
         char c  = sc.next().charAt(0);

        if(c=='a' ||c=='e'||c=='i'||c=='o' || c=='u' ){
            System.out.println(c+ "  " + "char is vowel");
        }
        else {
            System.out.println(c+ "  " + "char is consonant");
        }
        Soundtrack s1= new Soundtrack(1500.0,"boat","blaster");
        s1.getInformation();

    }


}
