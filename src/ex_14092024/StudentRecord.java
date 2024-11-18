package ex_14092024;

public class StudentRecord {
    int roll_no;
    String name;

    StudentRecord(int roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    void displayInformation(){
        System.out.println(roll_no+" "+name);
    }

}

class TestStudentNew{
    // Static method executed before main method.
    static {
        System.out.println("I am a static method:");
    }

    public static void main(String [] args){

        StudentRecord s1 = new StudentRecord(111,"Raghu");
        StudentRecord s2 = new StudentRecord(222,"Radhika");
        s1.displayInformation();
        s2.displayInformation();

    }

}
