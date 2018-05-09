package LinkedList;
//creation and insertion
public class List {

	Node head;
	static class Node//make static
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void insertStart(int data)
	{
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		
		return;
	}
	
	public void insertEnd(int data)
	{
		 Node newnode = new Node(data);
	        if (head == null)
	        {
	            head = new Node(data);
	            return;
	        }
	       // newnode.next = null;
	        Node temp_last = head; 
	        while (temp_last.next != null)
	            temp_last = temp_last.next;
	        temp_last.next = newnode;
	        return;
	}
	
	public void printlist()
	{	Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	public void delete(int data)//delete given data
	{
		Node temp=head.next;
		Node prev_node=head;
		while(temp.data!=data)
		{
			prev_node=prev_node.next;
			temp=temp.next;
		}
		prev_node.next=temp.next;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List newList=new List();
		newList.head= new Node(33);//connecting head
		
		Node n2=new Node(44);
		Node n3=new Node(3);
		
		newList.head.next=n2;
		n2.next=n3;
		
		newList.printlist();
		//insert at start
		newList.insertStart(5);
		
		//insert at end
		newList.insertEnd(400);
		
		
		//insert in the middle
		//newList.insertMiddle()
		
		System.out.println("after insertion"); 
		
		newList.printlist();
		
		
		
		newList.delete(44);
		System.out.println("after deletion"); 
		newList.printlist();
		
		
		
	}

}
