//TC-O(n)
//SC-O(1)
import java.util.Scanner; 
class prime{

static int prime(int n)
{
int count=0;
	for(int i=1;i<=n;i++)
	{
	if(n%i==0){
	count+=1;
	}
	}
	return count;
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int dup=n;
	int sum=0;
	int c= prime(n);
	if(c==2)
	{
	 System.out.println("Prime ");
	}else{
	System.out.println("NOT Prime ");
}

}
}
