package day25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Teacher", 60.000D);
        map.put("Police Officer",150.000D);
        print(map);
        HashMap<String, Double> secondmap=copyOF(map);
        System.out.println(secondmap);

    }

    public static void print(HashMap<String, Double> map){
        System.out.println(map);
    }
    // create method that return size of your map
    public static Integer sizeOfmap(HashMap<String,Double> no){
        no.keySet().size();// give size of  keys in map
        Integer SIZE=no.size();
        return SIZE;
    }
    // create method to remove all of the mappings/entries from a map
    public static void removeAll(HashMap<String, Double> map){
        //1.way
        map.clear();// removes everything from map
        //2.way
        Set<String> keys = new HashSet<>(map.keySet());
        for (String key:keys) {
            map.remove(key); // keyleri kaldirirken value yi de kaldirir.
        }
    }
    // create method to copy all of the mappings
    // from the specified map to another map
    public static HashMap<String,Double> copyOF(HashMap<String, Double> map){
        HashMap<String,Double> copy= new HashMap<>(map);

        // 2. way
        // HashMap<String, String> copy = new HashMap<>();
        // copy.putAll(map);

        return copy;
    }



    }



