public class RandomNumberGenerate {
    public static void main(String[] args) {
       generateNumber(10,20);
    }
    public  static void generateNumber(int min,int max){
        int  number = (int) (Math.random()*(max-min+1)+min);

        System.out.println(number);

    }
}
