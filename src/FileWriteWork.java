import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteWork {
    public static void main(String[] args) {
        try {
            Scanner sc= new Scanner("C:\\Users\\Bazigaaa\\IdeaProjects\\Java learn");
            while (sc.hasNextLine())
            {
                String reading= sc.nextLine();
                System.out.println(reading);
            }

        }
       catch (Exception ex)
       {
           System.out.println("something went wrong");
       }

    }
}
