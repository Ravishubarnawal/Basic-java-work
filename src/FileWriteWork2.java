import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteWork2 {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("myfile.txt", true);

            fw.write("Slow and steady wins the race");
            System.out.println("Wins");
        }
        catch ( Exception e)
        {
            System.out.println("Something is  wrong");
        }
    }

}
