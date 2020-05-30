package day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Task1 {
    // create method that generates random numbers and returns in ArrayList<Integer>
    // constraints: bound of random = 10
    // size of ArrayList , min = 100
         public static void main(String[] args) {
         ArrayList<Integer> generateNum= generateRandom(10,10);
         //System.out.println(generateNum);
          //HashMap<Integer,Integer> map=createHashmap(generateNum);
          //System.out.println(map);
          System.out.println(getfrequency(generateNum));

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
    // create method that counts frequency of numbers in list
    // Hint: map, .containsKey(), .get(), .put(), if
    // 0 : 1
    // 1 : 3
    // 4 : 2
         public static HashMap<Integer,Integer> createHashmap(ArrayList<Integer> list) {
             HashMap<Integer, Integer> map = new HashMap<>();
             for (Integer key : list) {//arraylist elemanlarini key olarak koyduk icine teker teker
                 if (map.containsKey(key)) {
                     System.out.println("I have already this key: " + key);
                     Integer value = map.get(key);// key in karsilik geldigi valueyi verecek
                  System.out.println(value + "--");
                  value++;
                     map.put(key, value);

                } else {
                    map.put(key, 1);
              }

             }

             return map;
         }//2 way, Collections.frequency()
    public static HashMap<Integer,Integer> getfrequency(ArrayList<Integer> list){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer integer : list) {
            map.put(integer, Collections.frequency(list,integer));// Arraylistin icindeki elemanlarin sikligini verir
        } return map; //benim listimin icinde kac tane bundan-integer- var demek  Collections.frequency(list,integer)
    }
    }






