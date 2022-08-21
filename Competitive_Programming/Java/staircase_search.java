import java.util.Scanner;

public class staircase_search {
    public static int[] search_staircase(int arr[][], int n, int m, int key) {
        if (key < arr[0][0] || key > arr[n - 1][m - 1]) {
            int[] res = { -1, -1 };
            return res;
        } else {
            int i = 0, j = m - 1;
            while (i <= n - 1 && j >= 0) {
                if (arr[i][j] == key) {
                    int[] res = { i, j };
                    return res;
                } else if (arr[i][j] > key) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        int[] res = { -1, -1 };
        return res;

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 45 },
                { 32, 33, 39, 50 }
        };
        int n = 4, m = 4;
        int key;
        Scanner inp = new Scanner(System.in);
        key = inp.nextInt();
        int[] res = search_staircase(arr, n, m, key);
        System.out.print(res[0] + " " + res[1]);
        inp.close();
    }

}
