package ex_14092024;

public class StudentNew {
    int roll_no;
    String name;
    void insertRecord(int rn,String na){
        roll_no=rn;
        name = na;
    }
    void displayInfo(){
        System.out.println(roll_no+" "+ name);
    }



}
    class StudentTest {
        public static void main(String [] args){
            StudentNew s1 = new StudentNew();
            StudentNew s2 =new StudentNew();
            s1.insertRecord(111,"Raghu");
            s2.insertRecord(112,"Radhika");
            s1.displayInfo();
            s2.displayInfo();

        }

    }

