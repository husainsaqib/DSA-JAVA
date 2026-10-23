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
    void create(int n)
    {
        Scanner sc=new Scanner(System.in);
        int value;
        for(int i=0;i<n;i++)
        {
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

        }
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else{
            
        }
    }
}

public class Doubly {

    public static void main(String[] args)
    {


    }
}
