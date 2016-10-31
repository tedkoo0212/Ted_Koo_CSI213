public class StackPractice 
{ 
  int size = 5; 
  int[ ] stackarray = new int[size]; 
  int top = 0;
  
  void push (int a) 
  { 
    if(top >= size)
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
    if(top < 1)
    {
      System.out.println(" ");
    }
    else if (top>=1)
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
    for (int i = top; i>=0  ;i-- ) // very simple but strong idea i couldn't think of.. 
    {
      System.out.println(stackarray[i]);   //needs to print from the top
   
    }
  } 
  
  
  public static void main(String[] args)
  {
    
    
    
    
    
    
    
  }