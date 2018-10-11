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
    	/*LinkedList<Integer>l = new LinkedList<>();
    	
    	if(list1==null)
    	{
    		return list2;
    	}
    	if(list2==null)
    	{
    		return list1;
    	}
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        LinkedList temp = list1;
        while (temp != null)
        {
            s1.push();
            temp = temp.next;
        }
        */
    	
		return null;
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


 

