class Summ{
    private int a,b;

   void seta(int x, int y){
        a=x;
        b=y;
    }
    int add(){
        return a+b;
    }
}

public class sum {
    public static void main(String[] args) {
        Summ s1 = new Summ();
        s1.seta(5, 7);
        System.out.println(s1.add());
    }
}

// final class we can't change the value