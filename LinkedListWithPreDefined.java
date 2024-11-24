package linked_list_programming;
import java.util.LinkedList;
public class LinkedListWithPreDefined {
	public  void LL()
	{
		LinkedList <String>list= new LinkedList<>();
		list.add("this");
		list.add("is");
		list.add("lokesh");
		list.add("Gangineni");
		list.remove(3);
		list.add(3,"kumar");
		list.addAll(4, list);
		System.out.println(list);
		System.out.println(list.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListWithPreDefined ll= new LinkedListWithPreDefined();
		ll.LL();
		

	}

}
