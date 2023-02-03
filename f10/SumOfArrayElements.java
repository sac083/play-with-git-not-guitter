package array;

public class SumOfArrayElements {
static int sum(int no)
{
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
}
public static void main(String[] args) {
	    int[] arr={123,143,888,456};
	    for(int i=0;i<arr.length;i++)
	    {
	    	while(arr[i]>9){
	    	     arr[i]=sum(arr[i]);
	    	}
	    	System.out.println(arr[i]);
	    }
}
}
