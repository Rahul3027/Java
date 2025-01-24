 import java.util.*;
class reverse {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a= s.nextInt();
    int reverse = 0;
     while(a!=0){
         int digit = a%10;
         reverse = reverse*10+digit;
         
         a /= 10;
     }  
     System.out.println(reverse);
      s.close();
      }
}