public class recursion2 {
    public static void printForward(int arr[] , int n) {
        if(n>=arr.length) return;

        System.out.print(arr[n]+" ");
        printForward(arr, n+1);
    }

    public static void printBackword(int arr[] , int n) {
        if(n>=arr.length) return;
        printBackword(arr, n+1);
        System.out.print(arr[n]+" ");
        
        
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2 , 3 ,4, 5};
        int n = 0;

        printForward(arr,n);
        System.out.println();
        printBackword(arr,n);
    }
}
