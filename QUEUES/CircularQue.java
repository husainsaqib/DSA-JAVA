package QUEUES;


class CircularQueue
{
	int arr[];
	int max;
	int front,rear;
	CircularQueue()
	{
		max=10;
		arr=new int[max];
		front=rear=-1;
	}
	CircularQueue(int max)
	{
		this.max=max;
		arr=new int[max];
		front=rear=0;
	}
		void enque(int value)
		{
			if(rear+1%max==front)
			{
				System.out.println("Queue is full");
			}
			else
			{
				if(rear==max-1)
					rear=0;
				else
					rear++;
				arr[rear]=value;
				if(front==-1)
					front=0;
			}
		}
	int deque()
	{
		int data=0;
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			data=arr[front];
			arr[front]=0;
			if(front==rear)
			{
				front=rear=-1;
			}
			else if(front==max-1)
			{
				front=0;
			}
			else
			{
				front++;
			}
			
		}
		return data;
		
	}
	void display()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else if(front<rear)
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(arr[i]);
			}
				
		}
		else if(front>rear)
		{
			for(int i=front;i<max;i++)
			{
				System.out.println();
			}
			for(int i=0;i<=rear;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
}
public class CircularQue {
	public static void main(String[] args)
	{
		CircularQueue cq=new CircularQueue();
		cq.enque(10);
		cq.enque(20);
		cq.enque(30);
		cq.enque(40);
		cq.enque(50);
		cq.display();
		System.out.println("remove element");
	    System.out.println(cq.deque());
	}

}

