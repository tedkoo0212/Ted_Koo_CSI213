public class sTs {
	
	int size = 5;
	int [] stackarray = new int[size];
	int [] stackarray2 = new int[size];
	int top = 0; // using as a pointer.
	
	void push(int a)
	{
		if (top > size)
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
	
	void copy()
	{
		for( int j=0 ; j<size ; j++)
		{
			stackarray2[j] = stackarray[j];
		}
	
	}
	public static void main(String[] args) 
	  { // TODO Auto-generated method stub 
	    sTs s = new sTs(); 
	    sTs s2 = new sTs();
	    s.push(10); 
	    s.push(34); 
	    s.push(33); 
	    s.push(93); 
	    s.pop(); 
	    s.push(67); 
	    s.copy();
	    s.print();
	    s2.peek();
	  }  
}
