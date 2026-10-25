import java.util.Scanner;

class Node1<T>
{
	T data;
	Node1 next;
	Node1(T data)
	{
		this.data=data;
		next=null;
	}
	
}
class GenLinked<T> extends Node1<T>
{
	Node1 head;
	int count;
	GenLinked<T>()
	{
		head=null;
		count=0;
	}
	void create(int n)
	{
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			
			Node1<T> nd=new Node1<>(T t);
			if(head==null)
			{

			}
				
			
		}
	}
}
public class GenericLinked {

	public static void main(String[] args) {
	

	}

}
