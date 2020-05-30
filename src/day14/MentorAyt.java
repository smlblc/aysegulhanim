package day14;

public class MentorAyt {
    public static void main(String[] args) {
        // icinde v ve m var ise sinifa alma
        String og1 = "Ahmetcan";
        String og2 = "Aysegul";
        String og3 = "Xavier";
        String og4 = "Mehmet";
        boolean og1Deger = true;
        boolean og2Deger = true;
        boolean og3Deger = true;
        boolean og4Deger = true;
        for(int i = 0; i<og1.length(); i++)
        {
            char c = og1.charAt(i);
            if(c=='v' || c=='m'){
                og1Deger = false;
                break;
            }
        }
        for(int i = 0; i<og2.length(); i++)
        {
            char c = og2.charAt(i);
            if(c=='v' || c=='m'){
                og2Deger = false;
                break;
            }
        }
        for(int i = 0; i<og3.length(); i++)
        {
            char c = og3.charAt(i);
            if(c=='v' || c=='m'){
                og3Deger = false;
                break;
            }
        }
        for(int i = 0; i<og4.length(); i++)
        {
            char c = og4.charAt(i);
            if(c=='v' || c=='m'){
                og4Deger = false;
                break;
            }
        }
        if(og1Deger) System.out.println(og1+" sinifta");
        if(og2Deger) System.out.println(og2+" sinifta");
        if(og3Deger) System.out.println(og3+" sinifta");
        if(og4Deger) System.out.println(og4+" sinifta");
    }
}
