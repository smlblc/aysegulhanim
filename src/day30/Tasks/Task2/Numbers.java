package day30.Tasks.Task2;

import java.util.ArrayList;

public class Numbers {
    //int number;
    //burada variable tanimlamadan direkt methodun parametresine de yazabilirsin int number

    public boolean checkEvenNumber(int n){
        return  n%2==0;
    }


    public ArrayList<Integer> checkeven(){
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i <21 ; i++) {
           if (checkEvenNumber(i)){
               list.add(i);
           }
        }
        return list;
    }
}
