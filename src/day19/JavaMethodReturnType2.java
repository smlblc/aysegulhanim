package day19;

public class JavaMethodReturnType2 {


    //Michael Jackson
    //initials: M. J.


    public static void main(String[] args) {
        String firstName = "Michael";
        String lastName = "Jackson";

        System.out.println(initial(firstName) + initial(lastName));
        System.out.println(initial("Furkat") + initial("Ali"));
        System.out.println(initial("Yusuf") + initial("Esenboga"));
    }

    private static String initial(String name) { // initial(String name) yani bunun icine string yazabilirisn
        return name.charAt(0) + ".";
        // String name1= name.charAt(0)+"." bunu kisadan return name.charAt olarak yazmis
    }
}
