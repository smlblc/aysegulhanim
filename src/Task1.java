

import java.util.*;

public class Task1 {
   /*
  Create a method name is update()

parameter is one Integer - String HashMap , one int , one String

return type is Integer - String map

if map  contains the parameter int

then  update the value of the int to parameter String

Example :

 map is





int is 3

String is Miami

result should be
1, "New jersey"
2, "New York"
3, "Miami"
4, "Paris"

  */
   public static void main(String[] args) {
     Map<Integer,String> city= new HashMap<>();
     city.put(1, "New jersey");
     city.put(2, "New York");
     city.put(3, "London");
     city.put(4, "Paris");
     HashMap<Integer,String> city2= new HashMap<>(city);
      System.out.println(update(city2,3,"Miami"));
   }
   public static HashMap<Integer,String>  update(HashMap<Integer,String> map, Integer one, String one1){
      HashMap<Integer,String> city= new HashMap<>();
      //Map<Integer,String> citycopy= new HashMap<>(map);
      Set<Map.Entry<Integer,String>> keyva= map.entrySet();
      for (Map.Entry<Integer, String> ent : keyva) {
         if(ent.getKey().equals(one)){
            city.put(one,one1);
      }else{
            city.put(ent.getKey(),ent.getValue());
         }
      } return  city;
   }
}

