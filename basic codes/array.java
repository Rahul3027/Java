import java.util.*;

public class array {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
    int []arr1 = new int[]{1,2,3,4,5,6,7,9,98};
    int []arr2 = new int[]{1,2,3,4,5,6,7,9,98};
    // for(int i = 0; i<10;i++){
    //     arr[i] = sc.nextInt();
    // }
    Arrays.sort(arr1);
    boolean b = Arrays.equals(arr1,arr2);
    String S = Arrays.toString(arr1);

    System.out.println(S);
    System.out.println(b);
    //sc.close();
    }
}
