import java.util.*;

public class Kadanes_algorithm {
    public int max(int cs, int ms) {
        if (cs > ms) {
            return cs;
        } else {
            return ms;
        }
    }

    public int maximum_sum_subarray(int arr[], int n) {
        int cs = 0;
        int ms = 0;
        for (int i = 0; i < n; i++) {
            cs = cs + arr[i];
            ms = max(cs, ms);
            if (cs < 0) {
                cs = 0;
            }
        }
        return ms;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int arr[] = {1,2,3,4,-10,9,8,-90};
        // int arr[] = {-1,-2,-3,-4,-10,-9,-8,-90};
        // int arr[] = {-1,-2,-3,-4,-10,-9,-8,-90,-1,-2,-3,-4,-10,-9,8,-90};

        // for(int i=0;i<n;i++)
        // arr[i]=sc.nextInt();
        Kadanes_algorithm k = new Kadanes_algorithm();
        System.out.println(k.maximum_sum_subarray(arr, n));
        sc.close();

    }
}