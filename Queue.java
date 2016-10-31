//This is a code i did together with professor during the class
// I am studying by looking at the concepts of queues we covered in the lectures.
public class Queue 
{
  // properties
  Node head;     
  Node tail;

  // Constructors
  Queue() 
  { 
    this.head = null;
    this.tail = null;
  }
  
  // getters & setters
  public Node getHead() 
  {
    return this.head;
  }
  public Node getTail() 
  {
    return this.tail;
  }
  public void setHead(Node newHead) 
  {
    if (this.head == this.tail)
      this.tail = newHead;
    this.head = newHead;
  }
  public void setTail(Node newTail) 
  {
    if (this.head == this.tail)
      this.head = newTail;
    this.tail = newTail;
  }
  
  
  // Methods
  // Adds node to the head of the list
  public void enqueue(int newInt) 
  {
    Node newNode = new Node(newInt);
    
    // if list is empty, 
    //add data to new node at both head & tail
    if (this.isEmpty()) 
    {
      this.head = newNode;
      this.tail = newNode;
    }
    else 
    // add to tail
    {
      // make former tail's next the new node
      // to put new node on end
      tail.setNext(newNode);
      // move tail to last item in queue
      this.tail=newNode;
    }
  }
  
  // removes & returns front node from queue
  public Node dequeue() 
  {
    // temporary node (to return)
    Node tmp = this.head;
    
    // check if there is more than one
    // item in queue
    if (this.head == this.tail) 
    {
      this.head = null;
      this.tail = null;
    }
    else{
      this.head = head.getNext();
      // isolate tmp node before returning
      // we wouldn't have to do this if
      // we were returning an int instead of
      // a Node
      tmp.setNext(null);
    }
    // node return the dequeued
    return(tmp);
  }
  
  // returns deep copy of node from 
  // front node of queue
  public Node peek() 
  {
    Node tmp = new Node(this.head.getData());
    return(tmp);
  }
  
  public boolean isEmpty() 
  {
    // tests if the list is empty
    return this.head == null;
  }
  
  // deletes entire list
  public void deleteQueue() 
  {
    this.head = null;
    this.tail = null;
  }
  
  public void print() 
  {
    if (this == null) 
    {
      System.out.println("null");
    } 
    else
    {
    // local Node variable to keep track of where we are
    // start at the head of the list
    Node current = this.head;
    // loop through until we get to end of list
    while(current != null) 
    {
      current.print(); // print current node
      // move current to the next node
      current = current.getNext();
    }
    System.out.println("");
    }
  }

}