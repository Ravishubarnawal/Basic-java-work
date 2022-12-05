public class test {
    public static void main(String[] args) {
        try {
            int y;
            y = 10 / 0;
            System.out.println("Output is:"+y);
        } catch (Exception e) {
            System.out.println("Exception occurs");
        }// we can't write multiple catch block in single try block.
    }
}



