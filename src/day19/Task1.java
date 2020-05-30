package day19;



import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] arr= {1,7,8,18,21};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        maxArrayValue(arr);
        minValueOfArray(arr);
        System.out.println("even numbers :");
        evenNumbers(arr);
       decreasingNumbers(arr);
    }



    public static void maxArrayValue(int[] arr){

        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            while(arr[i]> max){
                max=arr[i];
            }


        } System.out.println("max number is: "+max);
    }

    public static void minValueOfArray(int[]arr){
        int min=100;
        for (int i = 0; i <arr.length ; i++) {
            while(arr[i]< min){
                min=arr[i];
            }


        }
        System.out.println("min number is:"+min);
    }
     public static void evenNumbers(int[]arr){
         for (int i = 0; i <arr.length ; i++) {
             if (arr[i]%2==0){
                 System.out.print(arr[i]+"  ");
             }

         }
         System.out.println();
     }

     public static void decreasingNumbers( int[]arr){
        Arrays.sort(arr);

         for (int i = arr.length-1; i >=0 ; i--) {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }

}




