package day17;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Java2DArrayEx2 {

    //item prices

    //        Costco  Walmart  Aldii
    // water   $0.25   $0.27    $0.30
    // bread   $0.70   $0.40    $1.05
    // meat    $7.35   $9.99    $7.30

    public static void main(String[] args) {
        double[][] itemPrices = {
                {0.25, 0.27, 0.31},
                {0.74, 0.44, 1.05},
                {7.35, 9.99, 7.31}
        };
       //water price average
        double  sum=0;
        for(int a= 0; a<=0; a++){
            for(int b=0; b<itemPrices[a].length; b++){
                sum+=itemPrices[a][b];
            }

        }
        System.out.println("average of water prices "+ sum/itemPrices[0].length);

        // sum, average, by item, by store
        // print market names

        String[] markets = {"Costco", "Walmart", "Aldii","AVG"};
        System.out.print("\t  ");
        for(String market : markets) {
            System.out.print( market + "  " );
        }
        System.out.println();
        // print items name
        String[] items = {"Water", "Bread", " Meat"};

        // print all items
        for(int b = 0; b< itemPrices.length; b++) { ///3
            System.out.print(items[b]+": ");
            for(int c = 0; c < itemPrices[b].length; c++) {
                System.out.print("$" + itemPrices[b][c] + "   ");
                if(b==0&& c==2) System.out.print(sum/itemPrices[0].length);
            }
            System.out.println(); // looks like table
        }



}}
