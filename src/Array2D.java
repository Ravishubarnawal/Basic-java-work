public class Array2D {
    public static void main(String[] args) throws  Exception{
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] m2= {{7, 8}, {9, 10}, {11, 12}};
        int sum =0;
        int[][] R = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; i++) {
                for (int k=0; k<3; k++){
                    sum=sum+(m1[i][k]*m2[k][j]);
                }
               R[i][j]= sum;
                sum=0;
            }
        }
    }
}
