import java.util.*;

class evenNumbers
{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        // s.push(5);
        // s.push(10);
        // s.push(7);

        // s.pop();
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for(int i=0; i <n;i++){
           numbers[i] = sc.nextInt(); 
        }
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]%2==0){
                s.push(numbers[i]);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        sc.close();
    }
}