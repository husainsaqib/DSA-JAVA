package QUEUES;

class ListQueues
{
    qNode front;
    qNode rear;
    int count;
    ListQueues()
    {
        front=rear=null;
        count=0;
    }
    void enque(int value)
    {qNode nd=new qNode(value);
        if(front==null)
        {
            front=rear=nd;
        }
        else if(front==rear)
        {
            front.next=nd;
            rear=nd;
        }
        else
        {
            rear.next=nd;
            rear=nd;
        }
        count++;
    }
    int deque()
    {
        int data=0;
        if(front==null)
        {
            System.out.println("Queue is empty");
        }
        else 
        {
            data=front.data;
            front=front.next;
        }
        return data;
    }
     void display()
     {
        if(front==null)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            qNode t=front;
            while(t!=null)
            {
                System.out.println(t.data);
                t=t.next;
            }
        }
     }
}
public class Queuelist {
    public static void main(String[] args) {
        ListQueues lq=new ListQueues();
        lq.enque(30);
        lq.enque(50);
        lq.display();
        System.out.println(lq.deque());
    }
    
}
