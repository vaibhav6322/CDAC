//TC-O(n)
//SC-O(n),The space complexity is determined by the depth of the recursion
import java.util.Scanner;


class sqrt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        
        
        double result = Math.sqrt(a);
        System.out.println("GCD: " + result);
    }
}
