// class Example{
//     int a;
//     int b;

//     Example(int x,int y){
//         a=x;
//         b=y;
//     }

//     int sum(){
//         int result  = a+b;
//         return result;
//     }
// }

class Rectangle{
    int length;
    int width;
    
    // Rectangle(int length, int width){
    //    int  x = length;
    //    int  y = width;
    // }

    double area( double a , double b){
         double result = a*b;
        return result;
    }

    int area (int a , int b){
        int result = a*b;
        return result;
    }

    float area (float a , float b){
        float result  = a*b;
        return result;
    }
}

public class OOP {
    public static void main(String[] args){
      // object use
      
        // Example el = new Example();
        // el.a = 5;
        // el.b = 10;

        // System.out.println(el.a+el.b);

        // Constructor

        // Example e1 = new Example(5 , 5);
        // System.out.println(e1.a);
        // System.out.println(e1.b);

        // Example e2 = new Example(10 , 6);
        // System.out.println(e2.a + " " + e2.b);
        // System.out.println(e2.b);

        // Java method
        // Example el = new Example(4, 7);
        // System.out.println(el.sum());

        // area of rectangle

        Rectangle rl = new Rectangle();
        rl.length =5;
        rl.width = 10;
        System.out.println(rl.area(47.999999,87.76776));
        System.out.println(rl.area(4,6));
        System.out.println(rl.area(4.9,8.7));
    } 
}
