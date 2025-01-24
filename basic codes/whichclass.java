class Example{
    {
         System.out.println("Inside Block");
    }
   Example(){
    System.out.println("Inside Constroctor");
   }

}
public class whichclass {
    public static void main(String []args){
        new Example();
    }    
}
