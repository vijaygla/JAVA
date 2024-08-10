// // program to find print hello world ?
// public class hello {
//     public static void main(String[] args) {
//         System.out.println("hello world by vijay kumar");
//     }     
// }



// // program to print the pattern in * ?
// public class hello{
//     public static void main(String[] args){
        
//         System.out.println("\n*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//         System.out.println("*****");
//         System.out.println("******\n");
//     }
// }    



// // program to print the sum and difference of both the number ?
// public class hello{
//     public static void main(String[] args) {
//         int a=10;
//         int b=89;
//         int sum=a+b;
//         int diff=b-a;
//         System.out.print("SUM = ");
//         System.out.print(sum);
//         System.out.print("\n");
//         System.out.print("DIFFERNCE = ");
//         System.out.print(diff);
//     }



// // WAJP to take 2 input from user and find the sum of both the number ?
// import java.util.*;
// class hello{
//     public static void main(String[] arg){
//         Scanner s =new Scanner(System.in);
//         System.out.print("Enter the 1st number : ");
//         int a=s.nextInt();
//         System.out.print("Enter the 2nd number : ");
//         int b=s.nextInt();
//         int sum=a+b;
//         System.out.print("SUM OF BOTH NUMBER = "+sum);
//     }
// }




// // Program to find the take input of pcm marks in cbse class 12 student and print the average and percentage of pcm marks ?
// import java.util.*;
// class hello{
//     public static void main(String[] arg){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter your physics marks : ");
//         float a=s.nextFloat();
//         System.out.print("Enter your chemistry marks : ");
//         float b=s.nextFloat(); 
//         System.out.print("Enter your physics marks : ");
//         float c=s.nextFloat();
//         float sum =a+b+c;
//         float average=sum/3;
//         float percentage=(sum*100)/300;
//         System.out.println("AVERAGE OF PCM MARKS = "+average);
//         System.out.println("PERCENTAGE OF PCM MARKS = "+percentage);
//     }
// }




// // Taking two float number and sum of both the float number in java ?
// import java.util.*;
// class hello{
//     public static void main(String[] args){
//         Scanner s=new Scanner (System.in);
//         System.out.print("Enter the 1st float number : ");
//         float a=s.nextFloat();
//         System.out.print("Enter the 2nd float number : ");
//         float b=s.nextFloat();
//         float sum=a+b;
//         System.out.print("SUM OF BOTH FLOAT NUMBER = "+sum);
//     }
// }




// // Taking two input string from user and concatinate the string ?
// import java.util.*;
// class hello{
//     public static void main(String[] args){
//         Scanner s =new Scanner(System.in);
//         System.out.print("Enter your age : ");
//         int age =s.nextInt();
//         if(age>=18){
//             System.out.print("ADULT");    
//             }
//             else{
//                 System.out.print("NOT ADULT");
//             }
//     }
// }




// // Java program to check wheather the given number is odd or even ?
// import java.util.*;
// class hello{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter any number : ");
//         int a =s.nextInt();
//         if(a%2==0){
//             System.out.print("EVEN NUMBER");
//         }
//         else{
//             System.out.print("ODD NUMBER");
//         }
//     }
// }




// // Java progaram to take 2 number as input and check which is greater and and which is leaaer or equal ?
// import java.util.*;
// class hello{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the number A : ");
//         int a=s.nextInt();
//         System.out.print("Enter the number B : ");
//         int b=s.nextInt();
//         if(a==b){
//             System.out.print("A is equal to B");
//         }
//         else if(a>b){
//             System.out.print("A is greater than B");
//         }
//         else if(a<b){
//             System.out.print("A is lesser than B");
//         }
//         else{
//             System.out.print("RUN CODE AGAIN");
//         }
//     }
// }




// // Java program to take two string from user and add both the string ?
// import java.util.*;
// class hello{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter 1st string : ");
//         String a=s.next();
//         System.out.print("Enter 2nd string : ");
//         String b=s.next();
//         String c=a+b;
//         System.out.print("Concatation of String : "+c);
//     }
// }




// // Java program to give message by robat if you press 1 then give hello else print namaste ?
// import java.util.*;
// class hello{
//     public static void main(String[] args){
//         System.out.println("I AM A ROBAT");
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter the any number : ");
//         int a =s.nextInt();
//         if(a==1){
//             System.out.print("HELLO SIR");
        
//         }
//         else{
//             System.out.print("NAMASTE");
//         }
//     }
// }




// // java program to print the day as for example on press 1 print monday using Switch in java ?
// import java.util.*;
// class hello{
//     public static void main(String[] args){
//         System.out.print("ENTER THE NUMBER DECIADED FOR DAY : ");
//         Scanner s =new Scanner(System.in);
//         int day =s.nextInt();
//         switch(day){
//             case  1:System.out.println("MONDAY");
//             break;
//             case  2:System.out.println("TUESDAY");
//             break;
//             case  3:System.out.println("WEDNESDAY");
//             break;
//             case  4:System.out.println("THRUSDAY");
//             break;
//             case  5:System.out.println("FRIDAY");
//             break;
//             case  6:System.out.println("SATURDAY");
//             break;
//             case  7:System.out.println("SUNDAY");
//             break;
//             default:System.out.println("~~NOT A VALID INPUT~~");
//         }
//     }
// }




// // Java program to input the name , age and print  for the people those who input ?
// import java.util.*;
// class hello{
//     public static void main(String[] args){
//         System.out.print("enter your name:");
//         Scanner s = new Scanner(System.in);
//         String a=s.nextLine();
//         System.out.print("enter your age:");
//         String b=s.next();
//         System.out.print(a);
//         System.out.print(b);
//         System.out.print("!  !");
//     }
// }





// // Java program to print the 100 time "hello Sir" by using for loops.
// public class hello{
//     public static void main(String args[]){
//         for(int i=1;i<=100;i++){
//             System.out.println("GLA UNIVERSITY");
//         }
//     }
// }



// // java program to print the print the counting number from 0 to 11 ?
// public class hello{
//     public static void main(String args[]){
//         for(int i=0;i<=11;i++){
//             System.out.println(i);
//         }
//     }
// }




// // USING WHILE LOOP JAVA PROGRAM TO PRINT GLA UNIVERSITY UPTO 5 TIME?
// public class hello{
//     public static void main(String args[]){
//         int i=1;
//         while(i<=5){
//             System.out.println("GLA UNIVERSITY");
//             i++;
//         }
//     }
// }




// // USING DO WHILE LOOP PRINT 5 TIME GLA UNIVERSITY
// public class hello {
//     public static void main (String args[]) {
//         int i=1;
//         do{
//             System.out.println("GLA UNIVERSITY");
//             i++;
//         } while (i<5);
//     }
// }





// // PRINT THE SUM OF FIRST N NATURAL NUMBER 
// import java.util.*;
// public class hello {
//     public static void main (String args[]) {
//         int sum=0;
//         System.out.print("Enter the value of n : ");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             sum=sum+i;
//         }
//         System.out.print("SUM = "+sum);
//     }
// }




// // PRINT THE TABLE OF A NUMBER INPUT BY THE USER 
// import java.util.*;
// public class hello {
//     public static void main (String args[]) {
//         System.out.print("Enter the value of n : ");
//         Scanner sc=new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("TABLE OF " + n + " :- ");
//         for (int i=1;i<11;i++) {
//             int table=n*i;
//             System.out.println(table);
//         }
//     }
// }



// // JAVA PROGRAM TO FIND THE SUM OF ALL FIRST EVEN NATURAL NUMBER 
// import java.util.*;
// public class hello {
//     public static void main (String args []){
//         System.out.print("Enter n : ");
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         for (int i =0;i<=n;i=i+2){
//            sum=sum+i; 
//         }
//         System.out.print("SUM = "+sum);
//     }
// }




// // JAVA PROGRAM TO FIND THE SUM OF ALL FIRST ODD NATURAL NUMBER 
// import java.util.*;
// public class hello{
//     public static void main (String args []){
//         System.out.print("Enter n : ");
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         for (int i =1;i<=n;i=i+2){
//            sum=sum+i; 
//         }
//         System.out.print("SUM = "+sum);
//     }
// }



import java.util.*;
public class Hello{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of room : ");
        int no_room=sc.nextInt();
        System.out.print("Enter no. of student : ");
        int no_student=sc.nextInt();
        sc.close();
        System.out.print("Student per Room = "+(no_student/no_room));
    }
}
