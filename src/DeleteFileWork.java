import java.io.File;
import java.io.IOException;

public class DeleteFileWork {
    public static void main(String[] args) {
        File f =new File("myfile.txt");
        try {
            if (f.delete()) {
                System.out.println("File is Deleted");
            } else {
                System.out.println("File is  not available");
            }
        }
        catch ( Exception e)
        {
            System.out.println("Nothing else");
        }

    }
}




