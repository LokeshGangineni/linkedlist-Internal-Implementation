package linked_list_programming;

//import java.util.LinkedList;
class RemovingNthElement
{
	Node head;
	int size;
	
	public class Node
	{
		String data;
		Node next;
		Node(String data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	public void addFirst(String data)
	{
		
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	public void addLast(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head= newNode;
			return;
		}
		Node lastNode=head;
		while(lastNode.next!=null)
		{
			lastNode=lastNode.next;
			
		}
		lastNode.next=newNode;
		size++;
	}
	public void printList()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		Node currNode=head;
		while(currNode!=null)
		{
			System.out.print(currNode.data+" -->");
			currNode=currNode.next;
		}
		System.out.println("null");
			
	}
	public void removeFirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		head=head.next;
		size--;
	}
	public void removeLast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		Node currNode=head;
		Node lastNode=currNode.next;
		while(lastNode.next!=null)
		{
			currNode=lastNode;
			lastNode=lastNode.next;
		}
		currNode.next=null;
		size--;
	}
	public void reverse()
	{
		if(head==null) 
		{
			System.out.println("list is empty");
			return;
		}
		if(head.next==null)
		{
			System.out.println(head.data);
			return;
		}
		Node prevNode=null;
		Node currNode=head;
		Node nextNode=currNode.next;
		
		while(nextNode!=null)
		{
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
		}
		head=prevNode;
	}
	public void remove(int n)
	{
		if (head == null) 
		{
	        System.out.println("List is empty");
	        return;
	    }
		if (n == 0) 
		{
	        head = head.next;
	        return;
	    }
		 if (n < 0 || n >= size)
		 {
	            System.out.println("Index out of bounds");
	            return;
	        }

		Node currNode=head;
		Node nextNode=head.next;
		int idx=0;
		while(idx<n-1)
		{
			currNode=nextNode;
			nextNode=nextNode.next;
			idx++;
			
		}
		currNode.next=nextNode.next;
	}

	public static void main(String[] args) 
	{
		RemovingNthElement list = new RemovingNthElement();
		list.addFirst("is ");
		list.addFirst("This ");
		list.addLast("lokesh");
		list.addLast("Gangineni");
		list.printList();
		list.remove(0);
		list.printList();
		
		
		
		
	}
}	

