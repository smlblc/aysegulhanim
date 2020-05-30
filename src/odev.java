import java.util.Arrays;

public class odev {

    static {
        int a = 1;
        System.out.println(a);
    }

    {
        System.out.println("Yeni eklendi.");
    }
   // Create a 2D String Array which is
//[{"new jersey","atlanta","ohio"} ,
    //{"Pittsburgh" ,"ohio","new york","ohio"} ,
   // {"ohio","new york"}]

   // Change all the ohio to Florida

   // print the array
   public static void main(String[] args) {
       String[][] citys={{"new jersey","atlanta","ohio"} ,
       {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};

       for (int i = 0; i <citys.length ; i++) {
           for (int j = 0; j <citys[i].length ; j++) {
               if(citys[i][j].contains("ohio")){
                  citys[i][j]="florida";
               }
               System.out.println(citys[i][j]+" ");
           }

       }

   }

    {
        System.out.println("once test1 brachine yukle sonra merge et");
    }

}
