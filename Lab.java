// public class lab {
//     void m1(Float f){
//         System.out.println(f);
//     }
//     void m2(int x){
//         System.out.println(x);
//     }
//     public static void main(String args[]){
//         lab l=new lab();
//         l.m1(17.8f);
//         l.m2(23);
//     }
// }



// m1 and m2 are the two method name of 2 differnt signature int and float 

//  METHOD SIGNATURE-->method signature in java is defined as the structure of a method that is designed by the programmer. Method signature is the combination of a method name and its parameter list.A class cannot have 2 method with the same signature name.






// PATTERN PRINTING IN JAVA 
// JAVA PROGRAM TO PRINT THE RECTANGULAR PATTERN *
// import java.util.*;
// public class lab {
//     public static void main(String args []){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter no. of row : ");
//         int r=sc.nextInt();
//         System.out.print("Enter the no. of column : ");
//         int c=sc.nextInt();
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }




// JAVA PROGRAM TO PRINT THE * TRIANGULAR PATTERN 
import java.util.*;
public class Lab {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of row : ");
        int r=sc.nextInt();
        sc.close();
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
