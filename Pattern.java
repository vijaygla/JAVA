// // JAVA PROGRAM TO  PRINT RECTANGULAR "*" PATTERN HAVING 4 ROW AND 6 COULOM
// //      *******
// //      *******
// //      *******
// //      *******
// public class pattern {
//     public static void main(String args[]){
//         System.out.println("Rectangular pattern : ");
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=6;j++){
//                 System.out.print("*");
//             }
//         // System.out.print("\n"); 
//         System.out.println();
//         }
//     }
// }




// // JAVA PROGRAM TO PRINT THE HOLLOW RECTANGULAR "*" PATTERN HAVING ROW AND COLOUMN INPUT FROM USER
// //      ********
// //      *      *
// //      *      *
// //      ********
// import java.util.*;
// public class pattern {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of m : ");
//         int m=sc.nextInt();
//         System.out.print("Enter the value of n : ");
//         int n=sc.nextInt();
//         for(int i =1;i<=m;i++) {
//             for(int j=1;j<=n;j++) {
//                 if(i==1 || j==1 || i==m || j==n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("\n");
//         }

//     }
// }




// // JAVA PROGRAM TO PRINT THE PATTERN HALF PYRAMID
// //   *
// //   **
// //   ***
// //   ****
// //   *****
// //   ******
// import java.util.*;
// public class pattern {
//     public static void main(String args[]) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the value of row m : ");
//         int m=sc.nextInt();
//         for(int i=1;i<=m;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// // JAVA PROGRAM TO PRINT THE INVERTED HALF PYRAMID
// //   *****
// //   ****
// //   ***
// //   **
// //   *
// import java.util.*;
// public class pattern {
//     public static void main(String args[]) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the value of row m : ");
//         int m=sc.nextInt();
//         for(int i=m;i>=1;i--){
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }





// // JAVA PROGRAM TO PRINT THE HALF PYRAMID ROTATE 180 DEGREE
// //          *
// //        * *
// //      * * *
// //    * * * * 
// import java.util.*;
// public class pattern {
//     public static void main(String args[]) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the value of row m : ");
//         int m=sc.nextInt();
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=m-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// // JAVA PROGRAM TO PRINT THE GIVEN PATTERN 
// //   1
// //   12
// //   123
// //   1234
// //   12345
// import java.util.*;
// public class pattern {
//     public static void main(String [] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the number of row m : ");
//         int m=s.nextInt();
//         for(int i =1;i<=m;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.print("\n");
//         }
//     }
// }




// // JAVA PROGRAM TO PRINT THE GIVEN PATTERN 
// //   1
// //   22
// //   333
// //   4444
// //   55555
// import java.util.*;
// public class pattern {
//     public static void main(String [] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the number of row m : ");
//         int m=s.nextInt();
//         for(int i =1;i<=m;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.print("\n");
//         }
//     }
// }




// // JAVA PROGRAM TO PRINT THE GIVEN PATTERN 
// //   12345
// //   1234
// //   123
// //   12
// //   1
// import java.util.*;
// public class pattern {
//     public static void main(String [] args)  {
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter m : ");
//         int m=s.nextInt();
//         for(int i=1;i<=m;i++){
//             for (int j=1;j<=m-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.print("\n");
//         }
//     }
// }





// // JAVA PROGRAM TO PRINT THE BELLOW PATTERN
// //      1
// //      01
// //      101
// //      0101
// //      10101
// import java.util.*;
// public class pattern{
//     public static void main(String [] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the value of row m : ");
//         int m=s.nextInt();
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }



// important
// JAVA PRODUCT TO PRINT THE BELOW PATTERN(BUTTERFLY PATTERN)
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// import java.util.*;
// public class pattern{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the value of m : ");
//         int m=s.nextInt();
//         // upper_half
//         for(int i=1;i<=m;i++){
//             // first_part
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             // space
//             for(int j=1;j<=2*(m-i);j++){
//                 System.out.print(" ");
//             }
//             // second_part
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         // lower_part
//         for(int i=m;i>=1;i--){
//             // first_part
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             // space
//             for(int j=1;j<=2*(m-i);j++){
//                 System.out.print(" ");
//             }
//             // second_part
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }




// // JAVA PROGRAM TO PRINT THE BELLOW PATTERN SOLID RHOMBUS 
// import java.util.*;
// public class pattern{
//     public static void main(String args []){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the value of m : ");
//         int m=s.nextInt();
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=(m-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=m;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }





// // JAVA PROGRAM TO PRINT THE NUMBER PYRAMID 
// import java.util.*;
// public class pattern{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the value of m : ");
//         int m=s.nextInt();
//         for(int i=1;i<=m;i++){
//             // for_space
//             for(int j=1;j<=m-i;j++){
//                 System.out.print(" ");
//             }
//             // for_number
//             for (int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }




// // JAVA PROGRAM TO PRINT THE TRIANGULAR * PATTERN 
// import java.util.*;
// public class pattern{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the value of m : ");
//         int m=s.nextInt();
//         for(int i=1;i<=m;i++){
//             // for_upper_half 
//             for(int j=1;j<=m-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=(2*i-1);j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }




// // JAVA PROGRAM TO PRINT THE DIAMOND * PATTERN 
// import java.util.*;
// public class pattern{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the value of m : ");
//         int m=s.nextInt();
//         // for_upper_half
//         for(int i=1;i<=m;i++){ 
//             for(int j=1;j<=m-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=(2*i-1);j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         // for_lower_half
//         for(int i=m;i>=1;i--){
//             for(int j=1;j<=m-i;j++){
//                 System.out.print(" ");
//             }
//            for(int j=1;j<=(2*i-1);j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }





// vvi
// JAVA PROGRAM TO PRINT THE BELOW PATTERN 
// *****
//  ****
//   ***
//    **
//     *
// public class pattern {
//     public static void main(String args []){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=5;k++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }




// public class pattern {
//   public static void main(String[] args) {
//     for (int i = 5; i >= 1; i--) {
//       for (int j = 5; j > i; j--) {
//         System.out.print(" ");
//       }
//       for (int k = 1; k <= i; k++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }




// // JAVA PROGRAM TO PRINT THE BELOW PATTERN 
// //          **** ***
// //          **    **
// //          *      *

// //          *      *
// //          **    **
// //          ***  ***
// public class pattern{
//     public static void main(String args[]){
//         for(int i=0;i<4;i++){
//             for(int j=0;j<3-i;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<((2*i)+1);j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<3-i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         int space=4;
//         for(int i=0;i<3;i++){
//             for(int j=0;j<1+i;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<1+i;j++){
//                 System.out.print("*");
//             }
//             space =space-2;
//             System.out.print("\n");
//         }
//     }
// }





// // JAVA PROGRAMG TO PRINT THE GIVEN PATTERN 
// // * * * * * *
// // *         *
// // *         *
// // *         *
// // *         *
// // * * * * * *
// import java.util.*;
// public class pattern {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter value of row and column : ");
//         int m=sc.nextInt();
//         for(int i=0;i<m;i++){
//             for(int j=0;j<m;j++){
//                 if(i==0 || i==m-1 ||j==0 || j==m-1){
//                 System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





// // JAVA PROGRAM TO PRINT 
// //         *
// //       * ! *
// //     * ! * ! * 
// //   * ! * ! * ! * 
// import java.util.*;
// public class pattern {
//     public static void main(String args[]) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter value of row and column : ");
//         int m =sc.nextInt();
//         for(int i=0;i<m;i++){
//             for(int j=0;j<m-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<2*i+1;k++){
//                 if(k%2==0){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print("!");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }




// JAVA PROGRAM TO PRINT THE GIVEN PATTERN 
//                    *
//                  *    *
//                *        *
//              *            *
//                *        *
//                   *   *
//                     *
// import java.util.*;
// public class pattern {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int m=sc.nextInt();
//         for(int i=0;i<m;i++){
//             for(int j=0;j<m-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<m-i;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<i;j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }




// JAVA PROGRAM TO PRINT THE BELOW PATTERN
// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 5*5*5*5*5
// 4*4*4*4
// 3*3*3
// 2*2
// 1
// import java.util.*;
// public class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER N:");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=0;j<2*i-1;j++){
//                 if (j%2!=0){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(i);
//                 }
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>0;i--){
//             for(int j=0; j<2*i-1; j++){
//                 if (j%2!=0){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(i);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





// JAVA PROGRAM TO PRINT THE PATTREN 
// 1 2 3 4 5
// 2 2 3 4 5
// 3 3 3 4 5
// 4 4 4 4 5
import java.util.*;
public class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>j){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
