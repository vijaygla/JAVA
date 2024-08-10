import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int rev=0;
        int r;
        int temp=num;
        sc.close();
        while(temp!=0){
            r=temp % 10;
            rev=(rev*10)+r;
            temp=temp / 10;
        }
        if(num == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}
