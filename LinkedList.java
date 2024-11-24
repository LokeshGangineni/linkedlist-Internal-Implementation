package linked_list_programming;
class LinkedList
{
	static Node head;
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
	public static void length(LinkedList list)
	{
		Node currNode=head;
		int i=0;
		while(currNode!=null)
		{
			currNode=currNode.next;
			i++;
		}
		System.out.println(i);
		
	}

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.addFirst("is ");
		list.addFirst("This ");
		list.addLast("lokesh");
		list.addLast("Gangineni");
//		list.printList();
//		list.reverse();
		list.printList();
		length(list);
		
		
		
	}
}	

