public class MatrixZeroes {
    static void setMatrixZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        // To store which rows and columns are supposed to mark with zeroes.
        int[] row = new int[n];
        int[] col = new int[m];

        // Traverse the matrix using 2 nested loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // If the cell contains zero, then mark its row and column zero
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Mark cells zero if any of the row[i] or col[j] is 1
                if (row[i] == 1 || col[j] == 1)
                    arr[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 2, 0 },
                        { 3, 4, 5, 2 },
                        { 1, 3, 1, 5 } };

        // Function call
        setMatrixZeroes(arr);

        // Print the modified matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//This code is contributed by chinmaya121221
