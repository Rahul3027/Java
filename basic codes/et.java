 class A {
    int a = 10;

    void m1(){
        System.out.println("m1 is called");
    }
    void m2(){
        System.out.println("m2 is called");
    }
}
class B extends A{
    int b = 15;
    void m1(){
        System.out.println("m1 in b is called");
    }
    void m3(){
        System.out.println("m3 called");
    }
    
}

public class et{
     public static void main(String[] args) {
        A b1;
        b1 = new B();
     }
}
