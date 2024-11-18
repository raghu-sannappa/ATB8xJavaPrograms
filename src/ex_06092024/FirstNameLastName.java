package ex_06092024;

public class FirstNameLastName {

    public static String FullName(String firstName,String lastName){
        String Fullname = firstName+" "+lastName;
        return Fullname;

    }
    public static void main(String[] args){
        String value = FullName("Raghu","Sannappa");
        System.out.println("Full Name is - "+value);


    }
}
