// // 1.Enter 3 numbers from the user & make a function to print their average.
// public class exercise_1 {
//         static float average(float a,float b,float c){
//             float average =(a+b+c)/3;
//             return average;
//         }
//     public static void main(String args[]){
//         // calling of average function
//         System.out.println("AVERAGE="+average(1f,4f,6f));
//         System.out.println("AVERAGE="+average(5.7f,2.8f,5.5f));
//     }
// }



// // 2.Write a function to print the sum of all odd numbers from 1 to n.
// public class exercise_1{
//     static void sum(int a){

//         int sum=0;
//         for(int i=1;i<=a;i=i+2){
//             sum=sum+i;
//         }
//         System.out.print(sum);
//         return;
//     }
//     public static void main(String args[]){
//         sum(6);
//     }
// }




// // 3.Write a function which takes in 2 numbers and returns the greater of those two.
// public class exercise_1{
//     static void greater(int a,int b){
//         if(a>b){
//             System.out.println(a);
//         }
//         else{
//             System.out.println(b);
//         }
//         return;
//     }
//     public static void main(String args[]){
//         greater(2,7);
//         greater(8,4);
//     }
// }






// // 4.Write a function that takes in the radius as input and returns the circumference of a circle.
// import java.util.*;
// public class exercise_1{
//     public static float circumfernce(){
//         Scanner s=new Scanner(System.in);
//         float r=s.nextFloat();
//         float c=2*3.14f*r;
//         System.out.print(c);
//         return c;
//     }
//     public static void main(String args[]){
//         System.out.print("Enter the radius of circle : ");
//         circumfernce();
//     }
// }



// // 5.Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// import java.util.*;
// public class exercise_1{
//     static void elligible(float age){
//         if(age>=18){
//             System.out.print("ELIGIBLE");
//         }
//         else{
//             System.out.print("Not Elligible");
//         }
//         return;
//     } 
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter your age : ");
//         float age =s.nextFloat();
//         elligible(age);
//     }
// }




// // Write an infinite loop using do while condition.
// public class exercise_1{
//     public static void main(String args[]){
//         int a=1;
//         while(a<100){
//             System.out.println(a);
//             a++;
//         }
//     }
// }





// // Write a java program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
// import java.util.*;
// public class exercise_1{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         int positive_count=0;
//         int negative_count=0;
//         int zero_count=0;
//         boolean continue_entering=true;
//         while(continue_entering){
//             System.out.println("Enter any number (0 to stop) : ");
//             int n=s.nextInt();
//             if(n>0){
//                 positive_count++;
//             }
//             else if(n<0){
//                 negative_count++;
//             }
//             else{
//                 zero_count++;
//             }
//             System.out.print("do you want to continue(yes/no) : ");
//             String choice=s.next();
//             if(choice=="no"){
//                 continue_entering =false;
//             }
//         }
//         System.out.println("COUNT OF ALL POSITIVE ,NEGATIVE ,AND ZERO");
//         System.out.println("positive number = "+positive_count);
//         System.out.println("Negative number = "+negative_count);
//         System.out.println("Zero number = "+zero_count);
//         s.close();
//     }
// }




// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
// import java.util.*;
// public class exercise_1{
//     public static void main(String args[]){
//         int base,exponential,result=1;
//         Scanner s=new Scanner(System.in);
//         base=s.nextInt();
//         exponential=s.nextInt();
//         for(int i=1;i<=exponential;i++){
//             result=result*base;
//         }
//         System.out.print(base+"_ke_power_"+exponential+"="+result);
//     }
// }
// ALTERNATE METHOD TO DO SAME PROBLEM
// public class exercise_1{
//     public static void power(int a ,int b){
//         int result=1;
//         for(int i=1;i<=b;i++){ // here a=base , b=exponential 
//             result =result*a;
//         }
//         System.out.print(result);
//     }
//     public static void main(String args[]){
//         power(5,3);     // calling of function - 125
//         System.out.print("\n");     // 243
//         power(3,5);
//     }
// }




// // Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
// import java.util.*;
// public class exercise_1{
//     public static void main(String args[]){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter a : ");
//         int a=s.nextInt();
//         System.out.print("Enter b : ");
//         int b=s.nextInt();
//         int gcd=0;
//         for(int i=1;i<=a || i<=b; i++){
//             if(a%i==0 && b%i==0)
//             gcd =i;
//         }
//         System.out.print("gcd = "+gcd);
//     }
// }





// // JAVA PROGRAM TO FIND THE LCM and HCF OF 2 NUMBER 
// import java.util.*;
// public class exercise_1{
//     public static void main(String args []){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter a : ");
//         int a=s.nextInt();
//         System.out.print("Enter b : ");
//         int b=s.nextInt();
//         int hcf=0;
//         for (int i =1;i<=a || i<=b;i++){
//             if(a%i==0 && b%i==0){
//                 hcf =i;
//             }
//         }
//         System.out.println("HCF = "+hcf);
//         System.out.println("LCM = "+((a*b)/hcf));
//     }
// }





// // Write a program to print Fibonacci series of n terms where n is input by user :
// // 0 1 1 2 3 5 8 13 21 ..... 
// // In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// // (BONUS)
public class Exercise{
    public static void main(String args[]){
        System.out.println("Fibonacci series :-");
        int n=8;
        int n1=0,n2=1,n3;
        for(int i=1;i<=n;i++){
            System.out.print(n1+"  ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
} 
