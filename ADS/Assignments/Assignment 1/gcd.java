//TC-O(n)
//SC-O(n),The space complexity is determined by the depth of the recursion
import java.util.Scanner;

class GCD {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int result = gcd(a, b);
        System.out.println("GCD: " + result);
    }
}
