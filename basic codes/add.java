import java.util.*;
public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int j=1;
        int temp= 0;
        while(a!=0){
            int digit = a%10;
            if(digit<9)
             digit++;
             else
              digit=0;
              temp = digit*j+temp;
              j=j*10;
              a=a/10;
        }
        System.out.print(temp);
        sc.close();
    }
}
