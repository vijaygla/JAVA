import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        double n = sc.nextInt();
        sc.close();
        double ans = Math.sqrt(n);
        System.out.print("Square Root: "+ans);
    }
}
