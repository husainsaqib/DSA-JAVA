package QUEUES;


class QueArray
{
    int arr[];
    int max;
    int front,rear;
    QueArray()
    {
        max=8;
        arr=new int[max];
        front=rear=-1;

    }
    QueArray(int max)
    {
        this.max=max;
        arr=new int[max];
        front=rear=0;
    }
    void enque(int value)
    {
      if(rear==max-1)
      {
       System.out.println("Queue is full");
      }
      else{
        arr[++rear]=value;
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
        else{
            data=arr[front];
            if(front==rear)
            {
                front=rear=-1;
            }
            else{
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
        else{
            for(int i=front;i<=rear;i++)
            {
                System.out.println(arr[i]);
            }
        } 
    }
}
public class QueueArray {
    public static void main(String[] args) {
        QueArray qa=new QueArray();
        qa.enque(10);
        qa.enque(30);
        qa.enque(40);
        qa.enque(50);
        qa.display();
        System.out.println(qa.deque());
    }
    
}
