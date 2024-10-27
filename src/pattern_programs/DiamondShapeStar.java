package pattern_programs;

public class DiamondShapeStar {
    public static void main(String[] args) {
        int rows = 6;
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Reverse Pyramid
        for(int i=rows;i>=1;i--){
            for(int j=rows;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
