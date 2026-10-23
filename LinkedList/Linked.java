import java.util.Scanner;

class Node
{
	int data;
	Node next;
	Node()
	{
		data=0;
		next=null;
	}
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}
class LinkedList{
	Node head;
	int count;
	LinkedList()
	{
		head=null;
		count=0;
	}
    Scanner sc=new Scanner(System.in);
	void create(int n)
	{
		
		int value;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value");
			value=sc.nextInt();
			Node nd=new Node(value);
			if(head==null)
			{
				head=nd;
			}
			else
			{
				Node t=head;
				while(t.next!=null)
				{
					t=t.next;
				}
				t.next=nd;
				
			}
			count++;
		
		}
	}
    void addbegin(int value)
	{ Node nd=new Node(value);
	if(head==null)
		{
			head=nd;
		}
	else
	{
		nd.next=head;
		head=nd;
		

	}
	count++;
	}
	void addLast(int value)
	{
		Node nd=new Node(value);
		if(head==null)
		{
               head=nd;
		}
		else{
			Node t=head;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=nd;


		}
		count++;
	}
	void addBetween(int value,int pos)
	{
              if(pos>count||count<2)
			  {
				System.out.println("Invalid position");
			  }
			  else{
				Node nd=new Node(value);
				Node t=head;
				for(int i=1;i<pos-1;i++)
				{
					t=t.next;
				}
				nd.next=t.next;
				t.next=nd;
                count++;
			  }
			  
	}
	void search(int x)
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{  Node t=head;
			boolean flag=false;int index=1;
			while(t!=null)
			{
				if(t.data==x)
				{
                       flag=true;
					   break;
				}
				t=t.next;
				index++;
			}
		if(flag==false)
			System.out.println("Not fount");
		else
			System.out.println("Found at position"+index);
		}
	}   

	void deletefirst()
	{
		if(head==null)
		{
			System.out.println("List is already empty");
		}
		else
		{
			head=head.next;
			count--;
		}
	}
	void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is already empty");
		}
		else{
			Node t=head;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=null;
			count--;
		}
	}
	void deletebetween(int pos)
	{
		if(pos>count||count<2)
		{
			System.out.println("invalid position");
		}
		else
		{
			Node t=head;
			for(int i=1;i<pos-1;i++)
			{
				t=t.next;
			}
			
			count--;
		}
	}

void insertByValue(int value)
{
	Node nd=new Node(value);
	if(head==null||value<head.data)
	{

		nd.next=head;
		head=nd;

	}
	else
	{Node t=head;
	  while (t.next!=null && t.next.data<value) {
		t=t.next;
	  }
	  nd.next=t.next;
	  t.next=nd;

		}
		count++;
	}

	void display()

	{ Node t;
		if(head==null)
		{
			System.out.println("list is empyty");
		}
	t=head;
		while(t!=null)
		{
			System.out.println(t.data);
			t=t.next;
		}
	}
	
}
public class Linked {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.create(3);
		l.display();
		l.addbegin(3);
		l.display();
		

	}

}

