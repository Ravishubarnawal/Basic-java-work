import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class DateJavaWork
{
    static public void  main(String[] args) { // program will compile  if main method is written this instead of
        //standard format public static void main()

       DateAndTime.Display();




    }
}
class DateAndTime{
    static void Display()
    {
        LocalDate date=LocalDate.now();// this.now() funs will give today date.
        System.out.println("Local date is:"+date);
        LocalTime time =LocalTime.now();
        System.out.println("Local time is:"+time);
        LocalDateTime Datetime =LocalDateTime.now();
        System.out.println("Local datetimeis"+Datetime);
        //in case you want to print specific info like date ko year only chaiyo.

        System.out.println("Local year is:"+date.getYear());
        System.out.println("Local month value is:"+date.getMonthValue());
    }
}
