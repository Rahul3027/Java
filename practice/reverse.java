import java.util.*;

public class reverse {
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();

        String str = sc.nextLine();
        for(int i = 0 ; i<str.length();i++) {
            char ch = str.charAt(i);
            s.push(ch);
        }
        String ans = "";
        while(!s.isEmpty()){
            for(int i=0;i<str.length();i++){
                char ch = s.peek();
                ans += ch;;

                s.pop();
            }
        }
        System.out.print(ans);

        sc.close();
    }
}
