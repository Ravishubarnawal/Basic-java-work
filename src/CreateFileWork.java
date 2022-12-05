import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileWork {
    public static void main(String[] args) throws IOException {

        File f=new File("myfile.txt");
        f.createNewFile();
        try {
            if(f.createNewFile()) {
                System.out.println("File is created");
            }
            else {
                System.out.println("File already exist");
            }
            Scanner sc= new Scanner(f);
            while (sc.hasNextLine()){
              String show= sc.nextLine();
                System.out.println(show);
            }
















        }

        catch (Exception ignored)
        {
            System.out.println("Please create a file");
        }



    }
}
