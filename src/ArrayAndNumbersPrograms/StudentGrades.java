package ArrayAndNumbersPrograms;

public class StudentGrades {
    /*
    *Problem Description
A school uses the following rules to assign grades based on students’ marks

From 0 to less than 25 - F

From 25 to less than 45 - E

From 45 to less than 50 - D

From 50 to less than 60 - C

From 60 to less than 80 - B

From 80 to 100 - A

If the mark is less than 0 or greater than 100 then it is considered invalid.
  */
    public static void checkGrades(double marks){

        if(marks>=0 && marks<25){
            System.out.println("Student Failed, Give Another Exam ");
        } else if (marks>=25 && marks<45) {
            System.out.println("Student Grade is:- E");
        } else if (marks>=45 && marks<50) {
            System.out.println("Student Grade is:- D");
        } else if (marks>=50 && marks<60) {
            System.out.println("Student Grade is:- C");
        }else if (marks>=60 && marks<80) {
            System.out.println("Student Grade is:- B");
        }else if (marks>=80 && marks<100) {
            System.out.println("Student Grade is:- A");
        }else{
            System.out.println("Invalid Marks Enter valid Input From 0 to 100");
        }

    }

    public static void main(String[] args){
        double marksSt = 50;
       checkGrades(marksSt);

        }

    }

