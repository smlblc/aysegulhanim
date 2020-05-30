package day33.Tasks.task3;

public class task3 {
    //using recursion find factoriel of number
    public static void main(String[] args) {
        task3 task = new task3();
        task.factorielnum(5);
        System.out.println(task.fac);
    }


    public int  fac=1;
    public   int factorielnum(int i){
        System.out.println(i+"*");
        fac*=i;
        if (i==1){
            System.out.println("result "+ fac);
            return 1; //methodtan cikmak icin
        }
        return factorielnum(i-1);
    }
}
