import java.util.Scanner;

class pNode
{
    pNode prev;
    int data;
    pNode next;
    pNode()
    {
        prev=next=null;
        data=0;

    }
    pNode(int data)
    {
        prev=next=null;
        this.data=data;
    }
}
class DoublyLinked
{
    pNode head;
    pNode last;
    int count;
    DoublyLinked()
    {
    	head=last=null;
    	count=0;
    }
    void create(int n)
    {
        Scanner sc=new Scanner(System.in);
        int value;
        for(int i=0;i<n;i++)
        {   System.out.println("Enter value");
            value=sc.nextInt();
            pNode nd=new  pNode(value);
            if(head==null)
            {
                head=last=nd;
            }
            else if(head==last){
                   head.next=nd;
                   nd.prev=head;
                   last=nd;
            }
            else
            {
                last.next=nd;
                nd.prev=last;
                last=nd;

            }
        count++;
        }
    }
    void insertbegin(int value)
    {pNode nd=new pNode(value);
        if(head==null)
        {
            head=last=nd;
        }
        else
        {
            nd.next=head;
            head.prev=nd;
            head=nd;
        }
        count++;
    }
    void insertLast(int value)
    {
        pNode nd=new pNode(value);
        if(head==null)
        {
           head=last=nd;
        }
        else
        {
        	last.next=nd;
        	nd.prev=last;
        	last=nd;
        }
        count++;
    }
    void addBetween(int pos,int value)
    {
    	pNode nd=new pNode(value);
    	if(pos>count||count<2)
    	{
    		System.out.println("Invalid Position");
    	}
    	else
    	{
    		pNode t=head;
    		for(int i=1;i<pos-1;i++)
    		{
    			t=t.next;
    		}
    		nd.prev=t;
    		nd.next=t.next;
    		t.next.prev=nd;
    		t.next=nd;
    		
    	}
    	count++;
    }
    void deletebegin()
    {
    	if(head==null)
    	{
    		System.out.println("lsit is already empty");
    	}
    	else
    	{
    		head.next.prev=null;
    		head=head.next;
    		count--;
    		
    	}
    	
    }
    void deleteLast()
    {
    	if(head==null)
    	{
    		System.out.println("list is already empty");
    	}
    	else
    	{
    		pNode t=head;
    		while(t.next!=last)
    		{
    			t=t.next;
    		}
    		t.next=null;
    		last=t;
    		count --;
    	}
    	
    }
    void deleteBetween(int pos)
    {
    	if(pos>count||count<2)
    	{
    		System.out.println("Invalid position");
    	}
    	
    	else
    	{
    		pNode t=head;
    		for(int i=1;i<pos-1;i++)
    		{
    			t=t.next;
    		}
    		
    		t.next=t.next.next;
    		t.next.prev=t;
    		
    		
    		
    	}
    }
    
    void display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else{
            pNode t=head;
            while(t!=null)
            {
                System.out.println(t.data);
                t=t.next;
            }
        }
    }
}

public class Doubly {

    public static void main(String[] args)
    {

       DoublyLinked l=new DoublyLinked();
       l.create(4);
       l.display();
       System.out.println("Insert at beginning");
       l.insertbegin(30);
       l.display();
       System.out.println("Insert at last");
       l.insertLast(40);
       l.display();
       System.out.println("Insert at position");
       l.addBetween(3, 9);
       l.display();
       System.out.println("delete begin");
       l.deletebegin();
       l.display();
       System.out.println("delete at last");
       l.deleteLast();
       l.display();
       System.out.println("delete between");
       l.deleteBetween(5);
       l.display();
       
    }
}
