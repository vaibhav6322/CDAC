//TC-O(n)
//SC-O(n),The space complexity is determined by the depth of the recursion
import java.util.ArrayList;
import java.util.Scanner;

class palind {

    public static void main(String[] args) {
	int n=121;
	int sum=0;
	int dup=n;
	while(n!=0){
	int a=n%10;
	sum=sum*10+a;
	n=n/10;
        }
	if(sum==dup){
	System.out.println("PALINDROME");
}
	else{
	System.out.println("NOT");

}
}
}
