import java.util.LinkedList;
import java.util.Scanner;
class Main{
	
	  static class Graph{									//Building a graph
		   LinkedList< Integer > graph[] ;					//Adjacent List	
		   int size = 0 ;
		   
    	   public Graph(int size ){
		   this.size = size;
		   graph = new LinkedList[ size ];					//Initialised the list
				
			for( int i = 0 ; i < size ; i++ )
				graph[ i ] = new LinkedList<>();			//Created an Adjacent List	
		  }
	  
		  
		  public static void printGraph(Graph g){	
			for(int i = 0 ; i < g.size ; i++ ) {
				System.out.print( i);
					for( Integer j  : g.graph[ i ] )		
						 System.out.print( " -> " +j);
					 
					System.out.println();
			
		       }
		  }
		
		 public static void add(Graph g, int src, int dest ){	//Link the vertices of the graph	
			 
			 g.graph[ src ].add( dest );
			 g.graph[ dest ].add( src );
		 }
	  }															//End of class graph
 
	  public static void main( String [] agrs ){
		  
		  Scanner e = new Scanner( System.in );
		  System.out.println(" Enter the Size of the graph ");
		  
		  int size =e.nextInt();
		  Graph g= new Graph(size);
		  
		  for(int i = 0 ; i < size ; i++){
			  System.out.println( "Enter the first link and the second link ");
			   int src = e.nextInt();
			   int dest = e.nextInt();
		  g.add( g, src,dest );									//Initialise the link
		  }
		  System.out.println( "The undirected graph is \n ");
		  g.printGraph(g);                                      //Print the graph
		  
	  }
 }
		  
				