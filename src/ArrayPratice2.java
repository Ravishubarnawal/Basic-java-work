public class ArrayPratice2 {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
    int num=5;
    for (int i=0; i<5;i++){
        a[i]=i;
        System.out.println(a[i]);

    }
        for (int i = 0; i<5; i++) {
            b[i] = num;
            num++;
            System.out.println(b[i]);

        }
        for (int i = 0; i<5; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);

        }

    }


}
