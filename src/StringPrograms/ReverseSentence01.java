package StringPrograms;

public class ReverseSentence01 {
    public static String [] RevSentence(String [] words){
        int len = words.length;
        String [] revArray2 = new String[len];
        for(int i=0;i<=len-1;i++){
            revArray2[i] = words[len-1-i];
        }
        return revArray2;
    }
    public static void main(String [] args){
        String str = "I LOVE MY INDIA";
        String [] words = str.split(" ");

        String [] revArray1 = RevSentence(words);
        for(String var : revArray1){
            System.out.print(var+" ");
        }

    }
}
