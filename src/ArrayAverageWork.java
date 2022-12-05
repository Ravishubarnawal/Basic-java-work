public class ArrayAverageWork {
    public static void main(String[] args) {
        int [] values = {15,50,89,48,62};
        int total = 0;
       // values[4]=50;
        for(int i=0;i< values.length;i++)
        {
            total = total + values[i];
        }
        System.out.println("Total is:"+total);
        float avg= total/values.length;
        System.out.println(avg);



    }
}
