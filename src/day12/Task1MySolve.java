package day12;

import java.util.Random;
import java.util.Scanner;

public class Task1MySolve {
    public static void main(String[] args) {
       /*
       Write a Java program to evaluate exam result of student
    ex:
    'A'-> Excellent!!!
    'B'-> Well done
    'C'-> Good
    'D'-> Need improvement
    'F'-> Fail
     */
       String grade="grade";
        Random numbers= new Random();
        String not="ABCDEF#";
        char letter=not.charAt(numbers.nextInt(7));
      String result=Character.toString(letter);// equals kullanmak icin stringe cevirmek lazim
      if(result.equals("A")){ //hoca string ve reference typelarda ==  bunu tercih etmeyin dedi
         grade="aferin";
      }else if(result.equals("B")){
          grade="basarili";
      }else if(result.equals("C")){
          grade="calismalisin";
      }else if(result.equals("D")){
          grade="daha cok calismalisin";
      }else if(result.equals("#")){
          grade="sinifta kaldin";
      }
        System.out.println(grade+" "+result);






}}
