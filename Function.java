// // JAVA PROGRAM TO MAKE A FUNCTION TO PRINT THE NAME AFTER TAKING INPUT 
// import java.util.*;
// public class function{
//     public static void print_my_name(String name){
//         System.out.print("Thanku_"+name);
//         return;
//     }
//     public static void main(String[] args){
//         // input name by using Scanner 
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter your name please : ");
//         String name=s.next();
//         print_my_name(name);
//     }
// }




// // JAVA PROGRAM TO MAKE A FUNCTION AND PRINT THE SUM OF TWO NUMBER USING FUNCTION CALLING 
// import java.util.*;
// public class function{
//     public static int Sum(int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         int a=s.nextInt();
//         int b=s.nextInt();
//         int sum=Sum(a,b);
//         System.out.print("sum of two number="+sum);
//     }
// }





// // JAVA PROGRAM TO MAKE A FUNCTION TO RETURN PRODUCT OF TWO NUMBER 
// import java.util.*;
// public class function{
//     static int product(int a,int b){
//         int p=a*b;
//         System.out.print("Product of two number="+p);
//         return p;
//     }
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         int a=s.nextInt();
//         int b=s.nextInt();
//         product(a,b);
//     }
// }





// // JAVA PROGRAM TO FIND THE FACTORIAL OF ANY NUMBER
import java.util.*;
public class Function{
    static void factorial(int n){
        if (n<0){
            System.out.print("Enterd Invalid Number!");
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        factorial(n);
    }
}
