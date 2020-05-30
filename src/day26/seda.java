package day26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class seda {


    public static void main(String[] args) {
        ArrayList<Integer> generateNum=generateRandom(10,10);
        System.out.println(generateNum);
       HashMap<Integer,Integer> map=createHashmap(generateNum);
        System.out.println(map);

    }



    public static ArrayList<Integer> generateRandom(Integer size, Integer bound){
        ArrayList<Integer> yeni= new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i <size ; i++) {
            yeni.add(random.nextInt(bound));
        } return yeni;
    }

    // create HashMap and put numbers
    // from ArrayList as key ,and values should be 0
    // check if you already have "key" in your map
    // if you have, print ("I have already " + key)
    // print value of corresponding key in resultMap
    // increase value by one and put to resultMap again

    public static HashMap<Integer,Integer> createHashmap(ArrayList<Integer> list){
        HashMap<Integer,Integer> map= new HashMap<>();
        for (Integer key : list) {
            if (map.containsKey(key)) {System.out.println("I have already " + key);
            Integer value = map.get(key);
            value++;
            map.put(key, value);
        }else {
                map.put(key, 1);
        }


    } return  map;


}}
