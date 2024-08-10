// // JAVA PROGRAM TO PRINT THE NUMMBER FROM 1 TO 5 USING RECURSION.
// public class Recursion{
//     public static void printNumber(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printNumber(n-1);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         printNumber(n);
//     }
// }



// // JAVA PROGRAM TO PRINT THE SUM OF FIRST N NATURAL NUMBER USING RECURSION.
// public class Recursion{
//     public static void printSum(int i,int n,int sum){
//         if(i==n){
//             sum = sum+i;
//             System.out.println("Sum="+sum);
//             return;
//         }
//         sum =sum+i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }




// // FACTORIAL OF N NUMBER USING RECURSION.
// public class Recursion{
//     public static int calculateFactorial(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int fact = calculateFactorial(n-1);
//         int factorial=n*fact;
//         return factorial;
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int ans = calculateFactorial(n);
//         System.out.println("Factorial = "+ans);
//     }
// }
// // ALTERNATE METHOD
// public class Recursion{
//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         int ans=fact(n-1);
//         return n*ans;
//     }
//     public static void main(String[] args) {
//         int n=5;
//         System.out.println(fact(n));
//     }
// }
// BY TAIL RECURSION 
// public class Recursion{
//     public static int fact(int n){
//         if(n==5){
//             return n;
//         }
//         int ans=fact(n+1);
//         return n*ans;
//     }
//     public static void main(String[] args) {
//         int n=1;
//         System.out.println(fact(n));
//     }
// }


// public class Recursion{
//     public static void prints(int n){
//         if(n==51){
//             return;
//         }
//         System.out.println(n);
//         prints(n+1);
//     }
//     public static void main(String[] args) {
//         int n=1;
//         prints(n);
//     }
// }


// SEARCH ANY NUMBER FROM GIVEN ARRAY.
// public class Recursion{
//     public static void travrse(int arr[],int element, int index){
//         if(arr.length==index){
//             return ;
//         }
//         if(arr[index]==element){
//             System.err.println(index);
//         }
//         travrse(arr, element, index+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50};
//         int element=40;
//         travrse(arr, element,0);
//     }
// }



// CLACULATE THE POWER OF GIVEN NUMBER 
// public class Recursion{
//     public static int power(int n,int p){
//         if(p==1){
//             return n;
//         }
//         return n*power(n,p-1);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int p=3;
//         System.out.println(power(n,p));
//     }
// }



