   import com.sun.source.tree.WhileLoopTree;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class FileReadWork {
    public static void main(String[] args) {
        try {
            File f = new File("myfile.txt");
            Scanner sc = new Scanner (f);
            while(sc.hasNextLine()){
                //hasNextline returns true/keep running if there is also another  line of
                      //  input
                String Show =sc.nextLine();
                System.out.println(Show);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
