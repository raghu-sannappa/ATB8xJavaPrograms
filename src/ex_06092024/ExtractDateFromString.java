package ex_06092024;

public class ExtractDateFromString {
  public static String convertToString(String str) {
      StringBuffer sb = new StringBuffer(str);

      for (int i = 0; i <sb.length(); i++) {

          if (sb.charAt(i)<48 || sb.charAt(i)>57)  {

                sb.deleteCharAt(i);
                i--;
          }
      }
      return sb.toString();
  }

  public static void main(String[] args){
        String str = "fgfgghf2022-fgj10ghd-01jdjk";
            str = convertToString(str);
            System.out.println("Converted Number is :"+str);
  }
}
