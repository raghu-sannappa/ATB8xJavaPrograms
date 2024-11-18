package ex_13092024;

public class FindDiagonalSum {

    static int diagonalSumII(int [][] mat){
        int n = mat.length;
        int sum = 0;

        // Calculate the sum of both diagonals
        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += mat[i][i];

            // Add secondary diagonal element
            if (i != n - i - 1) { // Avoid double counting the center in odd length matrix
                sum += mat[i][n - i - 1];
            }
        }

        return sum;


    }

    public static void main(String args[]) {
        int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        assert (diagonalSumII(mat) == 25) : "Expect 25 for mat = {{1,2,3},{4,5,6},{7,8,9}}";
        System.out.println("All test cases in main function passed");
    }
}
