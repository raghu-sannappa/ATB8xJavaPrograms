package ex_18092024;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Raghu");
        map.put(2, "Radhika");
        map.put(3, "Manju");
        for (Map.Entry m : map.entrySet()) {

            System.out.println(m.getKey() + ":" + m.getValue());
        }

    }
}
