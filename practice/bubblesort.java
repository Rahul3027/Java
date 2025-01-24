class bubblesort {

    public static void printArr(int arr[] , int size){
        for(int i = 0 ; i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args) {
        int arr[] = {4, 5, 3, 7, 9, 2, 1, 8};
        int size = arr.length-1;
        for(int i= 0 ; i<size ; i++) {
            for(int j=0;j<size-i;j++) {
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        printArr(arr,size);
    }
}