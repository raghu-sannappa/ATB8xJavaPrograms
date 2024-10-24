package ex_21092024;

public class ExampleString2 {

        public static String switcheroo(String s){
            char[] charArray = s.toCharArray();
            for(int i=0;i<charArray.length;i++){
                if(charArray[i]=='a'){
                    charArray[i]='b';
                } else if (charArray[i]=='b') {
                    charArray[i]='a';
                }
            }
            // Convert the modified char array back to a string
            return new String(charArray);
        }

    public static void main(String [] args){
        String str = "aabacbaa";
        System.out.println( switcheroo(str));

    }
}

