import  java.util.*;
public class PalindromeString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any word:");
        String str =sc.next();
        sc.close();
        String rev="";
        int n=str.length();
        for(int i=0;i<n;i++){
            rev = str.charAt(i) +rev;
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not Palindrome");
        }
    }
}
