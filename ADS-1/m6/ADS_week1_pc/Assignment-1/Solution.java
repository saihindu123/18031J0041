import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
class AddLargeNumbers 
{
	 
    public static LinkedList numberToDigits(String number) 
    {
    	LinkedList<String>ll=new LinkedList<String>();
    	ll.add(number);
    	
    	//System.out.println(ll);
    	
		return ll;

    }

    public static String digitsToNumber(LinkedList list) 
    {
    	String s="";
    	for(int i=0;i<list.size();i++) 
    	{
    		 s=(String) list.removeLast();
    	}
		return s;
		 

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) 
    {
    	//LinkedList temp =list1;
    	//LinkedList temp1 =list2;
    	int carry=0, sum=0,n,m;
    	Stack<Integer> s1=new Stack<Integer>();
    	Stack<Integer> s2=new Stack<Integer>();
    	Stack<Integer> s3=new Stack<Integer>();
    	LinkedList list3 = new LinkedList ();
    	for(int i=0;i<list1.size();i++)
    	{
    		s1.push((Integer) list1.get(i));
    		System.out.println("stack1 "+s1.get(i));
    	}
    	for(int i=0;i<list2.size();i++)
    	{
    		s2.push((Integer) list2.get(i));
    		System.out.println("stack2 "+s2.get(i));
    	}
    
    	if(s1.size()>=s2.size())
    	{
    		for(int i=0;i<s2.size();i++)
    		{
    			n=(int) s1.pop();
    			m=(int) s2.pop();
    			sum=carry+n+m;
    			sum=sum%10;
    			carry=carry+n+m;
    			carry=carry/10;
    			s3.push(sum);
    		}
    	}
    	if(!s1.isEmpty())
    	{
    		n=(int) s1.pop();
    		sum=carry+n;
			sum=sum%10;
			carry=carry+n;
			carry=carry/10;
			s3.push(sum);
    	}
    	if(!s2.isEmpty())
    	{
    		m=(int) s2.pop();
			sum=carry+m;
			sum=sum%10;
			carry=carry+m;
			carry=carry/10;
			s3.push(sum);
    	}
    	if(carry>0) {
    		s3.push(carry);	
    	}
  while(!s3.isEmpty())
  {
	  System.out.println("*** "+s3);
  }
   
return list3;
    }
}
public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input)
        {
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
	}

}


 

