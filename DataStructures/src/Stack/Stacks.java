/**
 * 
 */
package Stack;

public class Stacks {
	int MAX=100;
	int arr[]=new int[MAX];
	int top=-1;
	
	boolean isEmpty()
	{
		if(top<0)
			return true;
	return false;	
	}
	
	public void push(int data)
	{
		if(top>100)
		{
			System.out.println("stack overload");
			return ;
		}
		
		else
		{
			arr[++top]=data;
			return;
		}
	}
	public int pop() {
		if(top<0) {
			System.out.println("stack underflow");
			return 0;
		}
		
		else
		{
			return arr[top--];
		}
	}
//	public static boolean balanced(char expn[])
//	{
//		Stacks st_obj=new Stacks();
//		
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stacks st=new Stacks();
		
		st.push(88);st.push(818);st.push(221);
		
		System.out.println(st.pop());
//		char expn[]= {'{','{','}','}'};
//		
//		if(balanced(expn))
//		{
//			System.out.println("balanced");
//		}
		
		
		

	}

}
