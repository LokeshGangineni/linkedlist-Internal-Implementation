package linked_list_programming;
import java.util.LinkedList;
import java.util.Collections;
public class SumOfTwoLL {
	
	 static LinkedList<Integer> l1= new LinkedList<Integer>();
	 static LinkedList<Integer> l2= new LinkedList<Integer>();
	  static LinkedList<Integer> l3= new LinkedList<Integer>();
	public SumOfTwoLL()
	{
	Collections.addAll(l1,2,4,3);
	Collections.addAll(l2,5,6,4);
	
	}
	public static void add(LinkedList<Integer> l1,LinkedList<Integer> l2,LinkedList<Integer> l3)
	{
		 int carry = 0;
	        int i = 0;
	        
	        while (i < l1.size() || i < l2.size() || carry != 0) {
	            int val1 = (i < l1.size()) ? l1.get(i) : 0;
	            int val2 = (i < l2.size()) ? l2.get(i) : 0;
	            int sum = val1 + val2 + carry;
	            carry = sum / 10;
	            l3.add(sum % 10);
	            i++;
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfTwoLL ll1= new SumOfTwoLL();
		add(l1,l2,l3);
	
			System.out.println(l3);
		
		
		

	}

}
