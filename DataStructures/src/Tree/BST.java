package Graphs;

public class BST {
	
	static Node root;
	BST()
	{
		root=null;
	}
	class  Node{
		int key;
		Node left,right;
		Node(int data)
		{
			key=data;
			left=null;
			right=null;
			
		}
	}
	public void insert(int data)
	{
		root=insertFinal(root,data);
	}
	public Node insertFinal(Node root,int data)
	{
		if(root==null) {
			root=new Node(data);
			return root;
		
		}
		
		
		if(data<root.key)
		{
			root.left=insertFinal(root.left,data);
			
		}
		
		else if(data>root.key)
		{
			root.right=insertFinal(root.right,data);
		}
		
		return root;
		
	}
	
	
	void inorder()  {
	       inorderRec(root);
	    }
	 
	    
	    void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.println(root.key);
	            inorderRec(root.right);
	        }
	    }
	    
	    
	  public  boolean search(Node root,int data)
	    {
	    	if (root != null) {
	            inorderRec(root.left);
	            //System.out.println(root.key);
	            if(root.key==data)
	            {
	            	//System.out.println("found");
	            	return true;
	            }
	            inorderRec(root.right);
	        }
	    	return false;
	    }
	    public static void main(String[] args) {
	    	BST tree=new BST();
	    	 tree.insert(500);
	         tree.insert(31);
	         tree.insert(222);
	         tree.insert(20);
	         tree.insert(220);
	         tree.insert(6);
	         tree.insert(0);
	         
	         tree.inorder();
	         //search element
	         System.out.println(tree.search(root,500)?"found":"not found");
	    }
	 

}
