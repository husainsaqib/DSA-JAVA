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

	void display()
	{ Node t;
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

	}

}

