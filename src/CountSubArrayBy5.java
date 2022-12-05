import java.util.*;
public class CountSubArrayBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(solution(arr, k));
    }
       public static int solution(int[] arr, int k) {
        int ans = 0;
        HashMap< Integer, Integer> map = new HashMap< >();
        map.getOrDefault(0, 1);
        int sum = 0;
        int rem = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                ans += rem;
                map.put(rem, map.get(rem) + 1);
            }
            else {
                map.put(rem, 1);
            }
        }
        return ans;
    }
}