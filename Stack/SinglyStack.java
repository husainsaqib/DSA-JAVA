
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
        head=top=nd;
     }
     else
     {
        top.next=nd;
        top=nd;
     }
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

}
public class SinglyStack {
    public static void main(String[] args) {
        
    }
}