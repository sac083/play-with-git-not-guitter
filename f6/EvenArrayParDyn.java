package array;

import java.util.Scanner;

public class EvenArrayParDyn {
	static void array(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		array(arr);
	}
}
