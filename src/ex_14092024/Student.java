package ex_14092024;

public class Student {
    int id;
    String name;
}
     class TestStudent{
    public static void main(String [] args){
        Student s1 = new Student();
        s1.id = 1_234;
        s1.name = "Raghu";
        System.out.println("Id-"+ s1.id);
        System.out.println("Name-"+ s1.name);
    }
}
