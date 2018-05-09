package Tree;

//basic structure of BT
class Node{
	int key;
	Node left,right;
	Node(int data)
	{
		key=data;
		left=null;
		right=null;
	}
}
public class BinaryTree {

	Node root; 
	
	BinaryTree()
	{
		root=null;
	}
	public  void postOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		postOrder(root.left);
		
		postOrder(root.right);
		
		System.out.println(root.key);
		
	}
	
	
	public void preOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.key);
		postOrder(root.left);
		
		postOrder(root.right);
		
		
	}
	
	
	public  void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		postOrder(root.left);
		System.out.println(root.key);
		postOrder(root.right);
		
		
		
	}
	public static void main(String args[])
	
	{
		BinaryTree tree_obj=new BinaryTree();
		
		tree_obj.root=new Node(10);
		tree_obj.root.left=new Node(20);
		tree_obj.root.right=new Node(30);
		
		tree_obj.root.left.left = new Node(4);
	    tree_obj.root.left.right = new Node(5);
	    
	    
	    long start=System.nanoTime();//System.currentTimeMillis();
	    System.out.println("postorder traversal");
	    tree_obj.postOrder(tree_obj.root);
	    long end=System.nanoTime();//System.currentTimeMillis();  
	    System.out.println("time="+(end-start));

	    start=System.nanoTime();    
	    System.out.println("preorder traversal");
	    tree_obj.preOrder(tree_obj.root);
	    end=System.nanoTime();
	    System.out.println("time="+(end-start));
	    
	    System.out.println("inorder traversal");
	    tree_obj.preOrder(tree_obj.root);
	                
	}

}
