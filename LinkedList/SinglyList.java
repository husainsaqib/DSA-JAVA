import java.util.Scanner;


class TwoRefLinked
{
    Node head;
    Node last;
    int count;
    TwoRefLinked()
    {
        head=last=null;
        count=0;
    }
    void create(int n)
    {
        Scanner sc=new Scanner(System.in);
        int value;
        for(int i=0;i<n;i++)
        {
            value=sc.nextInt();
            Node nd=new Node(value);
            if(head==null)
            {
                head=last=nd;
            }
            else
            {
                Node t=head;
                while(t.next!=null)
                {
                    t=t.next;
                }
                t.next=nd;
                last=nd;
            }
            count++;
        }
        
    }
    void display()
    {
       if(head==null)
        {
            System.out.println("list is already empty");
        } 
        else
        {
            Node t=head;
            while(t!=head)
            {
                System.out.println(t.data);
                t=t.next;
            }
        }
    }
}


public class SinglyList {
    public static void main(String[] args) {
        
    }
}
