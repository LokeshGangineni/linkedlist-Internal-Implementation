package linked_list_programming;

public class LLImplementation 
{
	Node head;
	int size;
	LLImplementation()
	{
		
	}
	public class Node
	{
		String data;
		Node next;
		public Node(String data) {
			this.data = data;
			this.next = next;
		}
		
	}
	
	public void addFirst(String data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head= newNode;
			return;
		}
		newNode.next=head;
		head= newNode;
		size++;
	}
	public void addLast(String data)
	{
		Node newNode= new Node(data);
		Node currNode= head;
		if(head==null)
		{
			head= newNode;
			return;
		}
		while(currNode.next!=null)
		{
			currNode=currNode.next;
			
		}
		currNode.next=newNode;
		newNode.next=null;
		size++;
	}
	
	public void removeFirst()
	{
		if(head==null)
		{
			System.err.println("Nothing present in the list");
		}
		Node currNode=head;
		head=currNode.next;
		size--;
	}
	public void removeLast()
	{
		if(head==null  )
		{
			System.err.println("Nothing present in the list");
		}
		if(head.next==null)
		{
			head=null;
			System.out.println("list became empty");
		}
		Node currNode= head;
		while(currNode.next.next!=null)
		{
			currNode=currNode.next;
		}
		currNode.next=null;
		size--;
	}
	
	public void printList()
	{
		Node currNode=head;
		while(currNode!=null)
		{
			System.out.print(currNode.data+ "-->");
			currNode=currNode.next;
		}
		System.out.print("null");
	}
	
	public void removeNthElement(int n)
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		if(n==0)
		{
			head=head.next;
			return;
		}
		if(n<0 || n>size)
		{
			System.out.println("Index out pof bounds");
			return;
		}
		int i=0;
		Node prevNode=head;
		Node currNode=head.next;
		while(i!=(n-1))
		{
			prevNode=prevNode.next;
			currNode=currNode.next;
			i++;
		}
		prevNode.next=currNode.next;
	}
	public void reverse()
	{
		Node currNode=head;
		Node nextNode= head.next;
		while(nextNode.next!=null)
		{
			currNode=currNode.next;
			nextNode=nextNode.next;
		}
		
		nextNode.next=currNode;
		while(nextNode.next.next!=head)
		{
			nextNode.next=currNode;
			currNode.next=nextNode.next.next;
			nextNode=nextNode.next;
			currNode=currNode.next;
		}
	}
	public static void main(String[] args) 
	{
		LLImplementation l=new LLImplementation();
		l.addFirst("is");
		l.addFirst("This");
		l.addLast("lokesh");
		l.addLast("Gangineni");
		l.removeNthElement(2);
		l.printList();
		System.out.println();
		l.reverse();
		l.printList();
	}
}
