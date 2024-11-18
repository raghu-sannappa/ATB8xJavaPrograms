package ex_13092024;

public class FindTotalStudents {

    public static int findStudents(int [][] matrix){
        int total =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){

                total = total + matrix[i][j];
            }
        }
        return total;

    }

    public static void main(String [] args){
        int [][] matrix = {{3,1},{4,1}};
       int res =  findStudents(matrix);
        System.out.println(res);

    }
}
