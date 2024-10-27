package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(111, "Raghu");
        map.put(222, "Radhika");
        map.put(333, "Manju");
        for (Map.Entry m : map.entrySet()) {

            System.out.println(m.getKey() + ":" + m.getValue());
        }

    }
}
