package StringPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicateChars {
    public static void main(String [] args){
    String str = "geeksforgeeks";
    char[] charArray = str.toCharArray();
    HashMap<Character,Integer>charCountmap  = new HashMap<Character,Integer>();

    for(char c : charArray){
        if(charCountmap.containsKey(c)){
            charCountmap.put(c,charCountmap.get(c)+1);
        }else {
            charCountmap.put(c,1);
        }
    }
    Iterator<Map.Entry<Character,Integer>>itr = charCountmap.entrySet().iterator();
    while(itr.hasNext()){
        Map.Entry<Character,Integer>entry = itr.next();
        if(entry.getValue()>1){
            itr.remove();
        }else {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
    }

}
