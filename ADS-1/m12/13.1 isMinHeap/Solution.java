import java.util.Scanner;

class Heap
{
	boolean  less(String a[],int j,int i)
	{
		return a[j].compareTo(a[i])<=0;
	}
	boolean min(int i,String a[])
	{
		int n=a.length-1;
		
		while(2*i+1<n)
		{
			int j=2*i+1;
			if(j<n && less(a,j+1,j))
				j++;
			if(!less(a,i,j))
				return false;
			else
				i=j;
		}
		return true;
		
	}
}
public class Solution 
{
	
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 switch(s)
		 {
		 case "String":
			            int n=sc.nextInt();
			            String s1[]=new String[n];
			            String s2=sc.nextLine();
			            for(int i=0;i<s1.length;i++)
			            {
			            	String s3=sc.next();
			            	String s4[]=null;
			            	s4=s3.split(",");
			            	Heap h=new Heap();
			            	System.out.println(h.min(0, s4));
			            }
			            break;
		 case "Float":
			            break;
		 case "Double":
			            break;
		 case "Integer":
			            break;
		 }

	}

}