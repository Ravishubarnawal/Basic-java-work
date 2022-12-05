public class ArrayWork2
{
    public static void main(String[] args) {
        String  names[]={"Ravishu", "Vishal","Naresh","Atul","Kanchan"};
        int grades[]= {10,20,30,40};
        System.out.println(names[3]);
        System.out.println(names.length);
        System.out.println(grades.length);
        for(int i =0; i<=names.length;i++)
        {
            System.out.println(names[i] + "=" + grades[i]);
        }
      //  System.out.println(names[1] + "=" + grades[1]);
        //System.out.println(names[2] + "=" + grades[2]);
        //System.out.println(names[3] + "=" + grades[3]);
        //System.out.println(names[4] + "=" + grades[24]);


    }
}
