package day25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {

    // create method that return Map as position and color
//    ex
//    1 Red
//    2 Green

    public static void main(String[] args) {
        HashMap<Integer, String> colorMap = getColorMap();
        System.out.println( check(colorMap,1));
        System.out.println(checkValue(colorMap,"Blue"));
        System.out.println(getValue(colorMap,3));
        printValueandKey(colorMap);
    }

    public static HashMap<Integer,String> getColorMap(){
        HashMap<Integer, String> result = new HashMap<>();
        String[] color = {"Red", "Green", "Blue", "Yellow"};

        for(int i = 0; i < color.length; i++) {
            result.put(i + 1, color[i]);
        }

        return result;
    }
    public static HashMap<Integer, String> getColorMap(String... color) { //String[]..
        HashMap<Integer, String> result = new HashMap<>();

        for(int i = 0; i < color.length; i++) {
            result.put(i+1, color[i]);
        }

        return result;
    }
    // create method to check if key is present/exists in the map
    public static Boolean check( HashMap<Integer, String> colorMap, Integer pos) {
        return  colorMap.containsKey(pos);
    }
    // create method to check if value is present/exists in the map
    public static Boolean checkValue( HashMap<Integer, String> colorMap, String color){
        return colorMap.containsValue(color);
    }

// create method to get value at specified position
    public static String getValue(HashMap<Integer, String> colorMap, Integer position){
            return colorMap.get(position);
    }


// create method to print map as value and key
//ex: Red 1
//    Blue 2
    public static void printValueandKey(HashMap<Integer, String> colorMap){
        Set<Map.Entry<Integer,String>> set =colorMap.entrySet();
        for (Map.Entry<Integer,String> valuekey:set) {
          Integer keys=valuekey.getKey();
          String value=valuekey.getValue();
            System.out.println("Values:"+value+" "+"Keys:"+keys);
        }
    }


}
