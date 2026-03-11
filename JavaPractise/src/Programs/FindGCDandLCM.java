package Programs;
import java.util.Scanner;

public class FindGCDandLCM {

    public int findGcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0) return b;
        if (b == 0) return a;

        int gcd = 1;
        int limit = Math.min(a, b);

        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public int findLcm(int a, int b, int gcd) {

        if (a == 0 || b == 0) {
            return 0;
        }

        return (Math.abs(a * b)) / gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        FindGCDandLCM gl = new FindGCDandLCM();

        int gcd = gl.findGcd(a, b);
        int lcm = gl.findLcm(a, b, gcd);

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
