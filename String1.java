// TAKING 2 STRING INPUT IN JAVA --vvi
// import java.util.*;
// public class string {
//     public static void main(String args[]){
//         Scanner sc_1=new Scanner(System.in);
//         System.out.print("Enter name_1 : ");
//         String name_1 = sc_1.nextLine();
//         Scanner sc_2 = new Scanner(System.in);
//         System.out.print("Enter name_2 : ");
//         String name_2 = sc_2.nextLine();
//         System.out.println(name_1);
//         System.out.println(name_2);
//     }
// }



// // JAVA PROGRAM TO CONCATNATE THE STRING IN JAVA 
// import java.util.*;
// public class string {
//     public static void main(String args[]){
//         Scanner sc_1=new Scanner(System.in);
//         System.out.print("Enter name_1 : ");
//         String name_1 = sc_1.nextLine();
//         Scanner sc_2 = new Scanner(System.in);
//         System.out.print("Enter name_2 : ");
//         String name_2 = sc_2.nextLine();
//         System.out.println(name_1);
//         System.out.println(name_2);
//         String name_3=name_1+" "+name_2;
//         System.out.println("Concatnation : "+name_3);
//     }
// }




// // JAVA PROGRAM TO FIND  LENGTH OF GIVEN STRING BY USER 
// import java.util.*;
// public class string {
//     public static void main(String args[]){
//         Scanner sc_1=new Scanner(System.in);
//         System.out.print("Enter name_1 : ");
//         String name_1 = sc_1.nextLine();
//         Scanner sc_2 = new Scanner(System.in);
//         System.out.print("Enter name_2 : ");
//         String name_2 = sc_2.nextLine();
//         System.out.println("LENTH OF NAME_1 : "+name_1.length());
//         System.out.println("LENTH OF NAME_2 : "+name_2.length());
//     }
// }




// // JAVA PROGRAM TO PRINT ALL THE CHARACTER OF STRING BY USING CHARAT FUNCTION
// import java.util.*;
// public class string {
//     public static void main(String args[]){
//         Scanner sc_1=new Scanner(System.in);
//         System.out.print("Enter name_1 : ");
//         String name_1 = sc_1.nextLine();
//         Scanner sc_2 = new Scanner(System.in);
//         System.out.print("Enter name_2 : ");
//         String name_2 = sc_2.nextLine();
//         String name_3=name_1+name_2;
//         // to print the all the character of string using FOR LOOP
//         for(int i =0;i<name_3.length();i++){
//             System.out.println(name_3.charAt(i));
//         }
//     }
// }





// // JAVA PROGRAM TO COMAPRE THE GIVEN STRING BY USER 
// import java.util.*;
// public class string {
//     public static void main(String args[]){
//         Scanner sc_1=new Scanner(System.in);
//         System.out.print("Enter name_1 : ");
//         String name_1 = sc_1.nextLine();
//         Scanner sc_2 = new Scanner(System.in);
//         System.out.print("Enter name_2 : ");
//         String name_2 = sc_2.nextLine();
//         if(name_1.compareTo(name_2)==0){
//             System.out.print("String are equal");
//         }else{
//             System.out.println("String are unequal");
//             if(name_1.compareTo(name_2)>0){
//                 System.out.print("String are positive ");
//             }else{
//                 System.out.print("String are negative");
//             }
//         }
//     }
// }





// // JAVA PROGRAM TO FIND THE NAME FROM A SENTENSE ASSIGNED AS A STRING IN JAVA
// public class string {
//     public static void main(String args[]){
//         String sentence ="my name is vijay kumar";
//         System.out.println("LENGTH : " + sentence.length());
//         String name =sentence.substring(11,22);
//         System.out.println(name);
//         System.out.println(sentence.substring(17));

//     }
// }





// JAVA PROGRAM TO CONVERT A STRING INTO NUMBER 
// public class string {
//     public static void main(String args[]){
//         String string ="12345";
//         int number =Integer.parseInt(string);
//         System.out.print(number);
//         System.out.print(string);
//     }
// }




// // JAVA PROGRAM TO CONVERT THE INTEGER INTO STRING AND THEN FIND THE LENTH OF NUMBER 
// public class string {
//    public static void main(String args[]) {
//       int number = 123;
//       String str = Integer.toString(number);
//       System.out.println(str.length());
//    }
// }





// // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
// import java.util.*;
// public class string {
//     public static void main(String args []){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the size of String array : ");
//         int n=sc.nextInt();
//         int  length=0;
//         String arr[]=new String[n];
//         System.out.println("Enter the element of array : ");
//         for(int i=0;i<n;i++){
//             arr[i]= sc.next();
//             length +=arr[i].length();
//         }
//         System.out.print("LENGTH OF INPUT STRING ARRAY = "+length);
//     }
// }





// // Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘p’ in the original string with letter ‘v’. 
// // Example : s=apple-->avvle
// import java.util.*;
// public class string {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter any string containing 'e' : " );
//         String s=sc.next();
//         String result="";
//         for(int i=0;i<s.length();i++){
//             if (s.charAt(i)=='p') {
//                 result +='v';
//             } else{
//                 result +=s.charAt(i);
//             }
//         }
//         System.out.print(result);
//     }
// }







// // Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// // Example : 
// // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// import java.util.*;
// public class string {
//     public static void main(String args[]) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter email : ");
//         String email=sc.next();
//         String user_name ="";
//         for(int i=0;i<email.length();i++){
//             if(email.charAt(i) == '@'){
//                 break;
//             } else {
//                 user_name += email.charAt(i);
//             }
//         }
//         System.out.print(user_name);
//     }
// }






// // JAVA PROGRAM TO SET ANY CHARACTER TO ANY INDEX OF STRING 
// public class string {
//     public static void main(String args []){
//         StringBuilder sb =new StringBuilder("vijay");
//         System.out.println(sb);
//         // print character at given index from any string 
//         System.out.println(sb.charAt(0));
//         // replace any character by giving index and charcter
//         sb.setCharAt(1,'o');
//         System.out.println(sb);
//     }
// }




// // // REVISION  
// public class string {
//     public static void main(String args[]) {
//         String str = "hello sir";
//         String str_2 = "vijay";
//         System.out.println(str);
//         System.out.println(str.length());
//         System.out.println(str.charAt(0));
//         System.out.println(str_2.compareTo(str));
//         System.out.println(str_2.substring(2,5));
//         for(int i=0;i<=str.length();i++){
//             System.out.println(str.charAt(i));
//         }
//     }
// }





// // USE FUNCTION INSERT DELETE AND APPEND 
// public class string {
//     public static void main(String args []){
//         StringBuilder sb = new StringBuilder("Tony");
//         System.out.println(sb);
//         sb.insert(2,'n');
//         System.out.println(sb);
//         sb.delete(2,4);
//         System.out.println(sb);
//         System.out.println(sb.append("h"));
//         System.out.println(sb.append("tc"));
//         System.out.println("LENGTH : "+sb.length());
//     }
// }





// // JAVA PROGRAM TO REVERSE A STRING 
// import java.util.*;
// public class string {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter any String : ");
//         String s =sc.nextLine();
//         String reverse = "";
//         for(int i=s.length()-1;i>=0;i--){
//             reverse += s.charAt(i);
//         }
//         System.out.print("REVERSE STRING : " +reverse);
//     }
// }





// // JAVA PROGRAM TO REVERSE A STRING 
// public class string {
//     public static void main(String args[]){
//         String name = "Vijay Kumar";
//         // by using in built function 
//         StringBuffer sb = new StringBuffer(name);
//         System.out.println(sb.reverse());
//         // by using loop
//         for(int i=name.length()-1;i>=0;i--){
//             System.out.println(name.charAt(i));
//         }
//     }
// }




// // JAVA PROGRAM TO REPLACE ANY STRING AND CHARACTER IN JAVA 
// public class String1{
//     public static void main(String args[]){
//         String s="vijay";
//         System.out.println(s);
//         s.replaceAll("[kumar]","Gupta");
//         System.out.println(s);
//     }
// }




// JAVA PROGRAM TO REMOVE DUPLICATE CHARACTER FROM  STRING 
// public class String1{
//     public static void main(String args[]){
//         String s="aaapppeelle";
//         StringBuffer sb =new StringBuffer();
//         for(int i=0;i<s.length();i++){
//             char ch =s.charAt(i);
//             int index = s.indexOf(ch,i+1);
//             if(index ==-1){
//                 sb=sb.append(ch);
//             }
//         }
//         System.out.print(sb);
//     }
// }




// // JAVA PROGRAM TO SHORT STRING ACCORDING TO ASKII VALUES 
// // test case
// // vijay ---> aijvy
// // apple---> aelpp
import java.util.Arrays;
public class String1 {
    public static String sortStringByASCII(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String test1 = "vijay";
        String test2 = "apple";

        String sorted1 = sortStringByASCII(test1);
        String sorted2 = sortStringByASCII(test2);

        System.out.println("Sorted string for " + test1 + ": " + sorted1);
        System.out.println("Sorted string for " + test2 + ": " + sorted2);
    }
}
