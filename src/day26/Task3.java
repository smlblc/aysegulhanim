package day26;

import java.util.*;

public class Task3 {

    // TC = Total Compensation
    // base salary
    // sign-in bonus
    // stock units

    // position | base salary | sign-in bonus | stock units | TC
    // Manager  | 100_000     | 5000          | 50_000      | 155_000
    // SDET     | 150_000     | 10_000        | 50_000      | 210_000
    // CEO      | 500_000     | 0             | 100_000     | 600_000

    // create method that return Map of Position and salary
    public static HashMap<String, List<Integer>> getPositionSalaries() {
        HashMap<String, List<Integer>> positionSalaries = new HashMap<>();

        String position = "Manager";
        List<Integer> salary = Arrays.asList(100_000, 5000, 50_000);
        positionSalaries.put(position, salary);

        position = "SDET";
        salary = Arrays.asList(150_000, 10_000, 50_000);
        positionSalaries.put(position, salary);

        position = "CEO";
        salary = Arrays.asList(500_000, 0, 100_000);
        positionSalaries.put(position, salary);

        return positionSalaries;
    }

    public static HashMap<String, HashMap<String, Integer>> getPositionSalaries2() {
        HashMap<String, HashMap<String, Integer>> result = new HashMap<>();

        String position = "Manager";//Stringi yazdik simdi HashMap<String, Integer> yap.
        HashMap<String, Integer> salary = new HashMap<>();
        salary.put("base salary", 100_000);
        salary.put("sign-in bonus", 5000);
        salary.put("stock units", 50_000);

        result.put(position, salary);
        position="SDET";
        HashMap<String,Integer> salary2= new HashMap<>();
        salary2.put("base salary",150_000 );
        salary2.put("sign-in bonus",10_000);
        salary2.put("stock units",210_000);
        result.put(position,salary2);
        position="CEO";
        HashMap<String,Integer> salary3= new HashMap<>();
        salary3.put("base salary",500_000 );
        salary3.put("sign-in bonus",0);
        salary3.put("stock units",600_000);
        result.put(position,salary3);


        return result;
    }

    public static void main(String[] args) {
        HashMap<String, List<Integer>> positionSalaries=getPositionSalaries();
        System.out.println(positionSalaries);
        HashMap<String,HashMap<String,Integer>> getPositionSalaries2= getPositionSalaries2();
        System.out.println(getPositionSalaries2);
        System.out.println(totalCompensation(positionSalaries));

    }

    // create method that calculates total compensation of positions
    public static HashMap<String,Integer> totalCompensation(HashMap<String, List<Integer>> map){
       HashMap<String,Integer> result= new HashMap<>();
        Set<Map.Entry<String, List<Integer>>> a=map.entrySet();
        for (Map.Entry<String, List<Integer>> b : a) {
            String key=b.getKey();
            Integer valueTotal=b.getValue().get(0)+b.getValue().get(1)+b.getValue().get(2);
            result.put(key,valueTotal);

        }
      return result;
    }

}
