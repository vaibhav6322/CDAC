//TC-O(n)
//SC-O(n),The space complexity is determined by the depth of the recursion
import java.util.ArrayList;
import java.util.Scanner;

class repeat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter it ");
        String str = sc.nextLine();
	int count=0;
        ArrayList<Character> arr= new ArrayList<>();
	for(int i=0;i<str.length();i++)
	{	count=0;
	for(int j=0;j<str.length();j++)
	{
		if(str.charAt(i)==str.charAt(j))
		{
			count+=1;
		}
    	   }
	if(count>1){
	arr.add(str.charAt(i));
	}  
}  
		for(char it:arr)
               {
		System.out.println(it);
		}
    }
}
