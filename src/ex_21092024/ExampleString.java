package ex_21092024;

public class ExampleString {

        public static String addSpaces(String [] words){
            return String.join(" ",words);
        }

    public static void main(String [] args) {
        String[] arr = {"Hello", "World"};
        System.out.println(addSpaces(arr));
    }
}
