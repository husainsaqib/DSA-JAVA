
import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        next = null;
    }
}

class Circular1 {
    Node1 head;
    Node1 last;
    int count;

    Circular1() {
        head = last = null;
        count = 0;
    }

    void createCircular(int n) {
        Scanner sc = new Scanner(System.in);

        int value;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value:");
            value = sc.nextInt();

            Node1 nd = new Node1(value);

            if (head == null) {
                head = last = nd;
                last.next = head;
            } else {
                last.next = nd;
                last = nd;
                last.next = head;
            }

            count++;
        }
	   
    }
void insertAtBegin(int value)
{
	Node1 nd=new Node1(value);
	if(head==null)
	{
		head=last=nd;
		nd.next=head;
	}
	else
	{nd.next=head;
		head=nd;
		last.next=nd;
		
	}
	count++;
}
void insertAtlast(int value)
{
	Node1 nd=new Node1(value);
	
	if(head==null)
	{
		head=last=nd;
		last.next=nd;
	}
	else
	{
		last.next=nd;
		nd.next=head;
		last=nd;
	}
	count++;
}
void insertBetween(int pos,int value)
{
	Node1 nd=new Node1(value);
	if(pos>count||count<2)
	{
		System.out.println("Invalid Position");
	}
	else
	{
		Node1 t=head;
		for(int i=1;i<pos-1;i++)
		{
			t=t.next;
		}
		nd.next=t.next;
		t.next=nd;
		
	}
	count++;
}
void deletebegin()
{
	if(head==null)
	{
		System.out.println("list is already empty");
	}
	else
	{
		last.next=head.next;
		head=last.next;
	}
}
void deletelast()
{
	if(head==null)
	{
		System.out.println("list is already empty");
	}
	else
	{
		Node1 t=head;
		while(t.next.next!=head)
		{
			t=t.next;
		}
		t.next=head;
		last=t;
	}
}
void deletebetween(int pos)
{
	if(pos>count||count<2)
	{
		System.out.println("Invalid position");
	}
	
	else
	{
		Node1 t=head;
		for(int i=1;i<pos-1;i++)
		{
			t=t.next;
		}
		t.next=t.next.next;
	}
}
void search(int value)
{
	boolean flag=false;
	if(head==null)
	{
		System.out.println("list is empty");
	}
	else 
	{
          Node1 t=head;
		  do
		  {
		  if(t.data==value)
		  {
			if(head.data==value)
				System.out.println("Node found");
			else
			{
				System.out.println("Found");
				flag=true;
				break;
			}
		 
		  }
		  t=t.next;
		  }while(t!=head);
		  if(flag==false)
			System.out.println("Not Found");

	}
}
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node1 t = head;

        do {
            System.out.println(t.data);
            t = t.next;
            
        } while (t != head);
        System.out.println(last.next.data);
    }
}

public class Circular {
    public static void main(String[] args) {
        Circular1 c = new Circular1();

        c.createCircular(7);
        c.display();
        System.out.println("Insertion at beginning");
        c.insertAtBegin(20);
        c.display();
        System.out.println("Insertion at end");
        c.insertAtlast(30);
        c.display();
        System.out.println("Insertion between");
        c.insertBetween(2, 40);
        c.display();
        System.out.println("delete at begin");
        c.deletebegin();
        c.display();
        System.out.println("delete at last");
        c.deletelast();
        c.display();
        System.out.println("delete between");
        c.deletebetween(6);
        c.display();
        
    }
}

