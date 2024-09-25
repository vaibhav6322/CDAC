//TC-Olog(n)
//SC-O(1)
import java.util.Scanner; 
class armstrong{

static int fact(int n)
{
	if(n==0){
	return 0;
	}
	return n*n*n;
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int dup=n;
	int sum=0;
	while(n!=0)
	{
	  int x=n%10;
	  sum+=fact(x);
	  n/=10;
	}
	if(dup==sum)
	{
	 System.out.println("Armstrong ");
	}else{
	System.out.println("NOT Armstrong ");
}

}
}
