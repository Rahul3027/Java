class A{
    int a;
    int b;

    int add(){
        return a+b;
    }

    A(int a , int b){
        this();
        this.a=a;
        this.b=b;
    }

    A(){
        System.err.println("Default constructor called");
    }
}

class B extends A{
    int c;
    int d;
    B(){
        System.out.println("child constructor called");
    }
}


public class inheritance {
    public static void main(String[] args) {
       // B b1 = new B();
    }
    
}
