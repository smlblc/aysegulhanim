package day6;

public class StringConcat {

    public static void main(String[] args) {
        //// Appends a string to the end of another string
        String name="michael";
        String surname=" jackson";
        String fullName= name+""+surname;
        System.out.println(fullName);
        //using concat() method
        // the other way using plus + between string
        String result=name.concat(surname);
        System.out.println(result);

        String husband="tarik ";
        String me="aysegul";
        String sum=husband.concat(me);//in order to write side by side
        System.out.println(sum);
        // there are lots of different way to write
        System.out.println(husband.concat(" aysegulu seviyor"));// tarik aysegulu seviyor
        System.out.println(me.concat(" is awesome!!"));
        System.out.println(husband+" "+me+"'u seviyor");
        System.out.println(husband+" ve "+me);
        System.out.println(husband+ " is awesome man!!".concat(" its my boy"));
        System.out.println(name.concat(" ").concat("kabakci"));

        // mr dos does not suggest but putting space with concat formula;
        // name.concat(" ").concat("other string")
    }
}
