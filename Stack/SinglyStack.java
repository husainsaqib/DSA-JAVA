
class StackList
{
  Node head;
  Node top;
  int count;
  StackList()
  {
    head=top=null;
    count=0;
  }
  void push(int value)
  {
     Node nd=new Node(value);
     if(head==null)
     {
        head=nd;
     }
     else
     {
        top.next=nd;
       
     }
      top=nd;
     count++;
  }
  int pop()

  {
    int data=0;
    if(head==null)
    {
        System.out.println("list is empty");
        return data;
        
    }
    else
    {
    Node t=head;
    while(t.next.next!=null)
    {
        data=top.data;
        top=t;
        
        
    }
    }
    return data;
  }
  void display()
  {
    if(top==null)
    {
      System.out.println("Stack Underflow");
    }
    else
    {
      Node t=top;
      do{
        System.out.println(t.data+" ");
        t=t.next;
      }while(t!=null);
    }
  }
}
public class SinglyStack {
    public static void main(String[] args) {
        StackList l=new StackList();
        l.push(20);
        l.push(30);
        l.display();
        System.out.println(l.pop());
    }
}