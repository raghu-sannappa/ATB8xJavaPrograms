package pattern_programs;

public class MultiplicationTable2 {

    public void TableMul(int a){
        System.out.println("Multiplication Table of 2");

        for(int i=1;i<=10;i++){
            int res = a*i;
            System.out.println(a +" * " +i +" = "+res);
        }
    }
    public static void main(String [] args){
        MultiplicationTable2 obj = new MultiplicationTable2();
        obj.TableMul(2);

    }
}
