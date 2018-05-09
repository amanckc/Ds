package LinkedList;

//import LinkedList.List2.Node;

public class DoubleList {

	Node head;
	
	class  Node{
		int data;
		Node prev,next;
		Node(int data)
		{
			this.data=data;
			prev=null;
			next=null;
		}
	}
	
	public void push(int data)
	{
		Node newNode =new Node(data);
		
		if(head==null){
		newNode.prev=head;
		newNode.next=null;
		head=newNode;
		return;
	}
		Node last=head;
		
		while(last.next!=null)
		{
			last=last.next;
		}
		 
		newNode.prev=last;
		newNode.next=null;
		last.next=newNode;
		
	}
	
	public void reverse(Node root)
	{
		Node curr=head;
		Node temp=null;
		while(curr!=null)
		{
			 temp = curr.prev;
	         curr.prev = curr.next;
	         curr.next = temp;
	         curr = curr.prev;
		}
		
		if (temp != null) {
            head = temp.prev;
        }
	}
	
	
	public void printlist(Node root)
	{
		Node last = null;
        
        while(root != null)
        {
            System.out.print(root.data + " ");
            last = root;
            root = root.next;
        }
        System.out.println();
	}
	
	public static void main(String args[])
	{
		DoubleList obj=new DoubleList();
		obj.push(5);obj.push(11);obj.push(51);obj.push(25);obj.push(33);
		
		obj.printlist(obj.head);
		
		
		obj.reverse(obj.head);
		System.out.println("reverse");
		obj.printlist(obj.head);
	}

}
