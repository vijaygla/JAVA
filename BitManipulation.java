// EXAMPLE OF GET BIT MANIPULATION 
public class BitManipulation {
    public static void main(String1 args[]){
        int number = 5;
        int position = 3;
        int bitmask = 1<<position;
        if((number & bitmask)==00){
            System.out.println("Bit was zero at "+position+" position");
        } else{
            System.out.print("Bit was One at "+position+" position");
        }
    }
}




// public class BitManipulation {
//     public static void main(String args[]){
//         int number = 5;
//         int position = 2;
//         int bitmask = 1<<position;
//         if((number & bitmask)==00){
//             System.out.println("Bit was zero at "+position+" position");
//         } else{
//             System.out.print("Bit was One at "+position+" position");
//         }
//     }
// }




// // EXAMPLE OF SET BIT MANIPULATION 
// public class BitManipulation {
//     public static void main(String args[]){
//         int number = 5;
//         int position = 1;
//         int bitmask = 1<<position;
//         int new_number =number | bitmask;
//         System.out.print(new_number);   
//     }
// }




// // EXAMPLE OF CLEAR BIT 
// public class BitManipulation {
//     public static void main(String args[]){
//         int number =5;
//         int position =2;
//         int bitmarks= 1<<position;
//         int newbitmarks=~bitmarks;
//         int newnumber = number & newbitmarks;
//         System.out.print(newnumber); // return decimal values 
//     }
// }




// public class BitManipulation {
//     public static void main(String args[]){
//         int number =5;
//         int position =1;
//         int bitmarks= 1<<position;
//         int newbitmarks=~bitmarks;
//         int newnumber = number & newbitmarks;
//         System.out.print(newnumber); // return decimal values 
//     }
// }





// // EXAMPLE OF UPDATE BIT MANIPULATION 
// import java.util.*;
// public class BitManipulation {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int number =5;  // 0101
//         int position =2;
//         System.out.print("Enter update chice(0 or 1) : ");
//         int update =sc.nextInt();
//         int bitmarks= 1<< position ;
//         if(update == 1){
//             System.out.print(bitmarks | number) ;
//         } else {
//             int newbitmarks=~bitmarks;
//             System.out.print(newbitmarks & number);
//         }
//     }
// }



// import java.util.*;
// public class BitManipulation {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int number =5;  // 0101
//         int position =1;
//         System.out.print("Enter update chice(0 or 1) : ");
//         int update =sc.nextInt();
//         int bitmarks= 1<< position ;
//         if(update == 1){
//             System.out.print(bitmarks | number) ;
//         } else {
//             int newbitmarks=~bitmarks;
//             System.out.print(newbitmarks & number);
//         }
//     }
// }





// Write a program to find if a number is a power of 2 or not.
// Write a program to toggle a bit a position = “pos” in a number “n”.
// Write a program to count the number of 1’s in a binary representation of the number.
// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]
