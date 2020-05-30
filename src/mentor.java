import java.util.HashSet;

public class mentor {





    public static boolean uniqe(String uniqe){
        char[] array=uniqe.toCharArray();
        HashSet<Character> set= new HashSet<>();
        for (int i = 0; i <array.length ; i++) {
            set.add(array[i]);
        }
        if (set.size()==array.length) return true;
        else return false;
    }
}
