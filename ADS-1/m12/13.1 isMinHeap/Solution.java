
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
    boolean less1(Double[] d, int j, int i) 
	{
    	//System.out.println(d.length+" "+j+" "+i);
		return d[j]<=d[i];
		 
	}
	boolean minnumber(int i,Double[] d)
	{
		int n=d.length-1;
		
		while(2*i+1<n)
		{
			int j=2*i+1;
			if(j<n && less1(d,j+1,j))
				j++;
			if(!less1(d,i,j))
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
					 int i1=sc.nextInt();
			            String[] s21=new String[i1];
			            String in=sc.nextLine();
			            for(int i=0;i<s21.length;i++)
			            {
			            	String s3=sc.next();
			            	String s4[]=null;
			            	s4=s3.split(",");
			            Double d[]=new Double[s4.length+1];
			          	for(int p=0;p<=s4.length-1;p++)
			          	{
			          		d[p]=Double.parseDouble(s4[p]);
			          	}
			            Heap h=new Heap();
		         	System.out.println(h.minnumber(0,d));
			            }
			            break;
		 case "Integer":
					 int inte=sc.nextInt();
			            String[] s31=new String[inte];
			            String s11=sc.nextLine();
			            for(int i=0;i<s31.length;i++)
			            {
			            	String s3=sc.next();
			            	String s4[]=null;
			            	s4=s3.split(",");
			            Double d[]=new Double[s4.length+1];
			          	for(int p=0;p<=s4.length-1;p++)
			          	{
			          		d[p]=Double.parseDouble(s4[p]);
			          	}
			            Heap h=new Heap();
		         	System.out.println(h.minnumber(0,d));
			            }
			            break;
		 case "Double":
			            int i12=sc.nextInt();
			            String[] sin=new String[i12];
			            String i22=sc.nextLine();
			            for(int i=0;i<sin.length;i++)
			            {
			            	String s3=sc.next();
			            	String s4[]=null;
			            	s4=s3.split(",");
			            Double d[]=new Double[s4.length+1];
			          	for(int p=0;p<=s4.length-1;p++)
			          	{
			          		d[p]=Double.parseDouble(s4[p]);
			          	}
			            Heap h=new Heap();
		            	System.out.println(h.minnumber(0,d));
			            }
			            break;
		 }

	}

}
