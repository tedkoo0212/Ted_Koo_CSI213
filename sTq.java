public class sTq {
	
	int size1 = 10;
	int size2 = 10;
	int max = 10;
	int [] stackarray = new int[size1];
	int [] queuearray = new int[size2];
	
	int top = 0; // using as a pointer.
	int rear = 0;
	void push(int a)
	{
		if (top > size1)
		{
			System.out.println(" ");
		}
		else
		{
			top ++;
			stackarray[top] = a;
		}
	}
	
	void pop()
	{ 
	    if(top < 0)
	    {
	      System.out.println(" ");
	    }
	    else if (top>=0)
	    {
	      
	      top --;
	      
	    }
	}
	
	void peek()
	  {
	    System.out.println(stackarray[top]); 
	  }
	
	void print() 
	  {
	    for (int i =top; i>=0  ;i-- )
	    {
	      System.out.println(stackarray[i]);   //print from the top
	    }
	  } 
	
	void enqueue(int value)     //inserting an element into the queue 
	  { 
	    if(size2 < max) 
	    { 
	      queuearray[rear] = value;
	       // Your Code goes here
	      size2 ++;
	      rear ++;
	    } 
	    
	    else 
	    { 
	      System.out.println("The queue is Full!"); 
	    } 
	  } 
	  
	  void dequeue()                   //deleting an element from the queue 
	  { 
	    if(size2<1) 
	      System.out.println("Queue is Empty!"); 
	    else 
	    { // Your Code goes here 
	      for(int j=0 ; j< size2 ; j++)
	      {
	    	  queuearray[j] = queuearray[j+1]; 
	      }
	      rear--;
	      size2--;
	      //queuearray[front] = null;
	    } 
	  } 
	  void print2()                      //printing the elements of the queue 
	  { // Your Code goes here 
	    for (int k=0; k<size2 ; k++)
	      System.out.println(queuearray[k]);
	  } 
	  void size() 
	  { 
	    System.out.print("The size of Queue:" + size2); 
	  } 
	  
	  void copy()
		{
			for( int j=0 ; j<size2 ; j++)
			{
				queuearray[j] = stackarray[j];
			}
		
		}
	  
	  public static void main(String[] args) 
	  { // TODO Auto-generated method stub 
	   sTq q = new sTq(); 
	   sTq s = new sTq();
	    q.enqueue(1); // inserting 1 
	    q.enqueue(2); 
	    q.enqueue(3); 
	    q.enqueue(4); 
	    q.enqueue(5); 
	    q.dequeue(); 
	    q.enqueue(6); 
	    q.enqueue(7); 
	    q.enqueue(8); 
	    q.enqueue(9); 
	    q.dequeue(); 
	    q.enqueue(10); 
	    q.enqueue(11); 
	    q.dequeue();
	    s.copy();   // calling a method which copies the contents of the stack to a queue.
	    q.print();  
	  }  
	

}
