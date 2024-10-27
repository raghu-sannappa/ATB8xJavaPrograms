package StringPrograms;

import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {
        String str = "a2b3c1d4e2";
        int res=0;
        char ch;
        for(int i=0;i<str.length();i++)
        {
            //The if statement checks if str.charAt(i) is a digit by checking if
            // it falls in the ASCII range for digits (48–57).
            if(str.charAt(i)>=48 && str.charAt(i)<=57)
            {

             //If it’s a digit, the program assumes the previous character (str.charAt(i - 1)) is the
                // letter to be repeated and assigns it to ch.
                ch=str.charAt(i-1);

                //res is reset to 0 to prepare for building the full count value.
                res=0;

               while(i<str.length() && (str.charAt(i)>=48 && str.charAt(i)<=57))
                {
                    res=Integer.parseInt(str.charAt(i)+"");
                    i++;
                }
                while(res>0)
                {
                    System.out.print(ch);
                    res--;
                }
            }

        }
    }
}
