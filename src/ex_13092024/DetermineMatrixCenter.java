package ex_13092024;

public class DetermineMatrixCenter {

        public static Integer findMatrixCenter(int [][] matrix){
            int rows = matrix.length;
            int cols = matrix[0].length;
            // Check if both rows and cols are odd
            if (rows % 2 == 1 && cols % 2 == 1) {
                // Return the center element
                return matrix[rows / 2][cols / 2];
            }

            // If no center exists, return null
            return null;

        }
    public static void main(String [] args){
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       int res =  findMatrixCenter(matrix);
        System.out.println(res);

    }
}
