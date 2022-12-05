public class PrimeNoWork
{
    public static void main(String[] args) {
        int n=7;  int sum=0 ;
        for (int i=2; i<=n-1;i++){
            if(n%i==0){
             sum=sum+1; // if no is not prime loop will not run and value of sum will be 0;
            }
            if(sum==0)
            {
                System.out.println("No is Prime");
            }
            else{
                System.out.println("No is not prime");
            }
        }
    }
}
