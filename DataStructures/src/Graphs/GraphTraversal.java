package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphTraversal {

	int V;//number of vertices 
	LinkedList<Integer> adj_list[];//using adjacency lists
	GraphTraversal(int num_vertices)
	{
		V=num_vertices;
		adj_list=new LinkedList[num_vertices];//1D
		for(int i=0;i<V;i++)
		{
			adj_list[i]=new LinkedList();//2D
		}
	}
	
	public void add(int x,int y)
	{
		adj_list[x].add(y);
	}
	public void printDfs(int node,boolean[] visited)
	{
		visited[node]=true;
		System.out.print(node+"->");
		Iterator<Integer> i=adj_list[node].listIterator();
		
//		do {
//			int x=i.next();
//			//visited[node]=true;
//			if(visited[x]!=true)
//				printDfs(x,visited);
//			
//		}while(i.hasNext());
		
		while(i.hasNext())
		{
			int x=i.next();
			//visited[node]=true;
			if(visited[x]!=true)
				printDfs(x,visited);
		}
	}
	public void Dfs(int start)
	{
		boolean visited[]=new boolean[V];
		
		printDfs(start,visited);
	}
	
	public void Bfs(int node)
	{
		boolean visited[]=new boolean[V];
		LinkedList<Integer> qu=new LinkedList<Integer>();
		visited[node]=true;
		qu.add(node);
		
		
		while(qu.size()!=0)
		{
			node=qu.poll();
			System.out.print(node+"->");
			
			Iterator<Integer> i=adj_list[node].listIterator();
			while(i.hasNext())
			{
				int x=i.next();
				if(!visited[x])
				{
					visited[x]=true;
					qu.add(x);
				}
				
			}
			
		}
	}
	public static void main(String args[])
	{
		GraphTraversal graph=new GraphTraversal(5);
		graph.add(0, 1);
        	graph.add(0, 2);
        	graph.add(1, 2);
        	graph.add(2, 0);
        	graph.add(2, 3);
        	graph.add(3, 3);
        	System.out.println("depth first");
		graph.Dfs(1);

        	System.out.println("");
        	System.out.println("breadth first");
		graph.Bfs(2);
		
	}
}

