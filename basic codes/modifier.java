class Example{
    private int a;

    void seta(int x){
        a=x;
    }
    int geta(){
        return a;
    }
}

public class modifier {
    public static void main(String []args){
        Example e1 = new Example();
        e1.seta(8);
        System.out.println(e1.geta()); // Output: 5
    }
}
