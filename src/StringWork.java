import java.sql.SQLOutput;

public class StringWork {
    public static void main(String[] args) {
        String country= "Nepal";
        String capital="Kathmandu";
        System.out.println("The length of Capital:"+capital.length());
        System.out.println("The length of country:"+country.length());
        System.out.println("Representing address as:"+capital.concat(country));
        System.out.println("Display the value:"+capital.charAt(5));
        String value = "I am from Kathmandu";
        System.out.println(value.replace("Kathmandu","Birgunj"));
    }
}

