package day29.task.task2;

public class StringUtils {

    //create class StringUtils and add static method named isBlank(String str)
    //which checks if string is null or empty
    //str = null
    //str = ""
    //str = "         "


    public static boolean isBlank(String str){
        return str==null||str.trim().isEmpty();
    }
}
