package day32.NonAccesModifier.Tasks;
/*
Write a program that will increase count every time when you create an object
HINT:
1. create class Counter
2. add static attribute [int count = 0]
3. increment value of count in default constructor of Counter class
write toString method to print count

 */
public class Counter {

    static int count=0; //class member field


    public Counter() {
        count++;
    }

    public String toString(){
        return "value "+count;
    }

    public static void main(String[] args) {
        Counter c1= new Counter();
        Counter c2=new Counter();
        // we can also do this
        new Counter();
        new  Counter();
        System.out.println(c2);
        System.out.println(new Counter());
        // We can also print in  this way
        System.out.println(c1.toString());

        Counter c3= new Counter();
        c3.count=17;// we reach this variable via non-static reference  and reassign but still static variable.
        //Counter.count=20;
        //count=20;
        System.out.println(c3+"====");
        Counter c5= new Counter();
        System.out.println(c2);


    }
}
