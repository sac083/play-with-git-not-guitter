package array;

public class ArrayReturn 
	{
		static int[] array(int[] arr)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]);
			}
			return arr;
		}
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] acc=array(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(acc[i]);
		}
	}
}
