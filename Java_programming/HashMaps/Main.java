package HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("Sharath", 6);
        map.put("dinesh",7);
        map.put("chiru",8);

        System.out.println(map.get("Sharath"));

        if(map.containsKey("chiru")){
            System.out.println(map.get("chiru"));
        }

        for(String Key : map.keySet()){
            System.out.println("Key: " + Key + ", Value: " + map.get(Key));
        }

        System.out.println(map.size());
    }
}
