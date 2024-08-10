import java.util.*;
public class LeapYear {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Year:");
        int year = sc.nextInt();
        sc.close();
        if(year % 400 ==0 || year % 4 == 0 && year % 100 != 0){
            System.out.print("LEAP YEAR");
        }else{
            System.out.print("NOT LEAP YEAR");
        }
    }
}
