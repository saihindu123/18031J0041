 
import java.util.Arrays;
import java.util.Scanner;

class NumberPairs
{
	int []array;
	int n;
	public void Sort(int[]array,int n)
	{
		//this.array=array;
		//this.n=n;
		int count=0;
		int temp=0,i;
		Arrays.sort(array);
		
		for(i=0;i<n-1;i++)
		{
			if(array[i]!=temp)
			{
				if(array[i]==array[i+1])
				{
					temp=array[i];
					count++;
				}
			}
		}
		System.out.println("Sorted array: ");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+array[i]);
		}
		System.out.println(" ");
		System.out.println("Number Pairs:"+count);
	}
}
public class Solution 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the array size");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the array values");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		NumberPairs np=new NumberPairs();
		np.Sort(array, n);

	}

}
