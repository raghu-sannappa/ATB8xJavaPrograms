package StringPrograms;



public class DisplayOnlyNumbers {
    public static void main(String [] args){
        String str =  "aU2ToM3atio4n";
        StringBuilder result = new StringBuilder();
        String temp ="";
        char ch;
        int res =0;

      //1st Way
    /*    for(char c:str.toCharArray()){
            if(Character.isDigit(c)){
                result.append(c);
            }
        }
        System.out.println(result.toString());*/

        //2nd Way.

        for(int i=0;i<=str.length()-1;i++){
            ch = str.charAt(i);
            if(Character.isDigit(ch)){
                temp = temp + ch;
            } else {
                if(!temp.isEmpty()){
                    res = Integer.parseInt(temp);
                }
            }
        }
        System.out.println("Numbers inside String is:-"+res);
    }

}
