public class BubbleSort {
    public static void main(String1 args[]){        int arr[] ={7,8,3,1,2};
        int n=arr.length;
        // bubble short 
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
