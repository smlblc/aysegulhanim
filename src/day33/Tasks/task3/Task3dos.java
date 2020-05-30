package day33.Tasks.task3;

public class Task3dos {


    //1.way
    int factorial = 1;

    public int fact(int n) {
        if(n == 1) return 1;

        factorial *= n;
        return fact(n - 1);
    }
    //2.way- anlamadim bunu!
    public int factorial(int num) { //5
        if(num == 1) {
            return 1;
        }
        return factorial(num - 1) * num; //5
    }

    public static void main(String[] args) {
        Task3dos t = new Task3dos();
        t.fact(5);
        System.out.println("Fact: " + t.factorial);//1.way

        System.out.println("Fact: " + t.factorial(5));//2.way


    }

}
