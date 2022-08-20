import java.util.*;

public class Kadanes_algorithm {
    public int maximum_sum_subarray(int arr[], int n) {
        int max_so_far = arr[0];
        int max_ending_here = arr[0];
        for (int i = 1; i < n; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
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