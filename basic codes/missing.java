import java.util.*;

public class missing {
    public static int missingElement(int[] arr1, int[] arr2) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        return sum1 - sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array (N): ");
        int N = sc.nextInt();
        
        int arr1[] = new int[N];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[N - 1];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < N-1; i++){
            arr2[i]  = sc.nextInt();
        }

        System.out.println(missingElement(arr1, arr2));
         sc.close();
    }
}