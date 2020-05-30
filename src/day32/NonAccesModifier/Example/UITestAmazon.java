package day32.NonAccesModifier.Example;

public class UITestAmazon {

    public final static String url = "https://www.amazon.com/";
    public static final String url2 = "https://www.amazon.com/";
    //final static veya static final farketmez
    // burada onemli olan final modifier oldugu icin stringi reassigned yapamazsin sadece icindeki harfleri degistirebilirsin
    // yani final bir kere ilan edildiginde toptan bir degisiklik yapmak mumkun degil o variable da.
}
