package LinkedList;

//import LinkedList.List.Node;
//search and mergesort and reverse and loop detection
public class List2 {
 
	Node head;
	static class Node
	{	Node next;
		int data;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void loop()
	{
		Node fast=head,slow=head;
		while(fast!=null && slow!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				System.out.println("loop detected");
				return ;
			}
		}
		
		return;
	}
	public void push(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void printList()
	{	Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	public Node getMiddle(Node root)
	{ 
		//Node tryng=null;
		if(root==null)
			return root;
		Node fast=root.next,slow=root;
		while(fast!=null)
		{
			//tryng=(fast.next).next;  A.next.next not working!!
			//slow=slow.next;
			fast=fast.next;
			if(fast!=null)
			{	
				fast=fast.next;
				slow=slow.next;
			}
		} 
		
		return slow;
	}
	
	public Node merge(Node left,Node right)
	{
		Node temp=null;
		if(left==null)
			return right;
		if(right==null)
			return left;
		//now sort accordingly
		if(left.data<=right.data)
		{
			temp=left;
			temp.next=merge(left.next,right);
		}
		
		if(left.data>=right.data)
		{
			temp=right;
			temp.next=merge(left,right.next);
		}
				return temp;	
	}
	public Node mergesort(Node root)
	{
		if(root==null||root.next==null)
			return root;
		
		Node mid_node=getMiddle(root);
		Node next_to_mid=mid_node.next;
		mid_node.next=null;
		//use recursion now
		Node left=mergesort(root);
		Node right=mergesort(next_to_mid);
		//finally merge left part and right part
		Node finalList=merge(left,right);
		
		return finalList;
			
	}
	public boolean search(Node root,int element)
	{
		if(root==null)
			return false;
		if(root.data==element)
			return true;
		 
		return search(root.next,element);
		
		
	}
	
	public Node reverse(Node temp,Node prev)
	{
		if(temp.next==null)
		{
			head=temp;
			temp.next=prev;
			return null ;
		}
		
		Node forward=temp.next;
		temp.next=prev;
		reverse(forward,temp);
		
		return head;
	}
	public static void main(String args[])
	{
		
		List2 list=new List2();
		list.push(22);
		list.push(2);
		list.push(4);
		list.push(0);list.push(21);list.push(100);list.push(10);list.push(30);
		
		
		list.printList();
		
		if(list.search(list.head,2)) {
			System.out.println("element found");
		}
		
		list.head=list.mergesort(list.head);
		System.out.println("list after merge sort is");
		list.printList();
		
		
		list.reverse(list.head,null);
		
		System.out.println("list after reversing is");
		list.printList();
		//create loop
		list.head.next.next.next=list.head;
		list.loop();
		
	}
	
}
