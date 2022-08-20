public class Spiral_print_array {
    public void print_spiral_Array(int[][] arr, int n, int m) {
        int startrow = 0, startcol = 0, endrow = n - 1, endcol = m - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // Startrow
            for (int col = startcol; col <= endcol; col++) {
                System.out.print(arr[startrow][col]);
                System.out.print(" ");
            }
            System.out.print(" ");

            // Endcol
            for (int row = startrow + 1; row <= endrow; row++) {
                System.out.print(arr[row][endcol]);
                System.out.print(" ");
            }
            System.out.print(" ");

            // Endrow
            for (int col = endcol - 1; col >= startcol; col--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(arr[endrow][col]);
                System.out.print(" ");
            }
            System.out.print(" ");

            // startcol
            for (int row = endrow - 1; row >= startrow; row--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(arr[row][startcol]);
                System.out.print(" ");
            }
            System.out.print(" ");
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        Spiral_print_array sp = new Spiral_print_array();
        sp.print_spiral_Array(arr, 4, 4);

    }

}
