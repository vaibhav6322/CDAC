//TC-O(n)
//SC-O(n),The space complexity is determined by the depth of the recursion
import java.util.Scanner; 
class factorial{

static int fact(int n)
{
	if(n==0){
	return 1;
	}
	return n*fact(n-1);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	
	int facto=fact(n);
	System.out.println(facto);
}
}