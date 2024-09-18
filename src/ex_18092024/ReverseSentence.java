package ex_18092024;

public class ReverseSentence {
    public static void main(String [] args){
        String  str = "I LOVE MY INDIA";
        String [] words = str.split(" ");
        String outputstring = " ";

        for(int i=words.length-1;i>=0;i--){
            outputstring = outputstring + words[i]+" ";
        }
        System.out.println("Reversed Word is:"+outputstring);

    }
}
