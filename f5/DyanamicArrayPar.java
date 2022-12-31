package array;

import java.util.Scanner;

public class DyanamicArrayPar {
static int array(int[] arr)
{
	int sum=0;
	for(int i=0;i<arr.length;i++){
		sum=sum+arr[i];
	}
	return sum;
}
public static void main(String[] args) {
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter array Values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=array(arr);
		System.out.println(sum);
	}
}
}
