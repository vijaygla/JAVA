// public class Array {
//     public static void main(String args[]){
//         int [] marks=new int[3];
//         marks[0]=23;
//         marks[1]=24;
//         marks[2]=25;
//         // System.out.println(marks);  //print address of array
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         // loop using in array print 
//         for(int i=0;i<3;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }





// JAVA PROGRAM TO PRINT THE ARRAY USING A LOOP BUT INPUT ARE PRE DEFINED
// public class Array {
//     public static void main(String args[]){
//         int [] marks={23,24,25};
//         for(int i=0 ; i<3;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }




// JAVA PROGRAM TO TAKE A INPUT ARRAY FROM USER AND PRINT BY USING LOOP 
// import java.util.*;
// public class Array{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the size of array :");
//         int size=s.nextInt();
//         int number[]=new int[size];
//         System.out.println("INPUT:-");
//         for (int i=0;i<size;i++){
//             number[i]=s.nextInt();
//         }
//         System.out.println("OUTPUT:-");
//         for(int i=0;i<size;i++){
//             System.out.println(number[i]);
//         }
//     }
// }



// JAVA PROGRAM TO FIND A NUMBER IN ARRAY USING TRAVERSING IN ARRAY .
// import java.util.*;
// public class Array{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the size of array :");
//         int size=s.nextInt();
//         int arr[]=new int[size];
//         System.out.println("INPUT:-");
//         for (int i=0;i<size;i++){
//             arr[i]=s.nextInt();
//         }
//         System.out.println("Enter a:");
//         int element =s.nextInt();
//         System.out.println("OUTPUT:-");
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==element){
//                 System.out.print("index of element  "+ element+" = "+i);
//             }
//         }
//     }
// }





// import java.util.*;
// public class Array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of row : ");
//         int m=sc.nextInt();
//         System.out.print("Enter number of column : ");
//         int n=sc.nextInt();
//         int [][] arr =new int [m][n];
//         // input of 2-d array
//         System.out.println("Enter the element of array : ");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         // output of 2-d arrray
//         System.out.println("OUTPUT ARRAY :-");       
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+"  ");
//             }
//             System.out.print("\n");
//         }
//     }
// }





// JAVA PROGRAM TO FIND ANY NUMBER IN A 2-D MATRIX WHICH IS INPUT FROM USER
import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int r=sc.nextInt();
        System.out.print("Enter number of column : ");
        int c=sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("Enter element of array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter number to check index : ");
        int number = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==number){
                    System.out.print("Index of number "+number+"="+"["+i+"]"+"["+j+"]");
                }
            }
        }
        sc.close();
    }
}
