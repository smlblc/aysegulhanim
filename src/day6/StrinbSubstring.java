package day6;

public class StrinbSubstring {

    // its cut your string AND IT WILL GIVE STRING
    /*
    substring()
        Extracts the characters from a string,
    beginning at a specified start position,
    and through the specified number of character
         */
    public static void main(String[] args) {
        String text="hello world";
        String res= text.substring(2, 5);
        System.out.println(res);

        String world=text.substring(6);// 6 dan oncesini at kes
        System.out.println(world);
        System.out.println(text.substring(0)); // en basindan kestigimiz icin tamami cikti


        String name="tarik huseyin";
        System.out.println(name.substring(4, 10)); // 4 kaliyor 10 u da kes at
        System.out.println(name.substring(5)); // 5 den oncesini atiyorsun
    }
}
