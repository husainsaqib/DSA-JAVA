import java.util.Scanner;

class CircularDoub
{
    pNode head;
    pNode last;
    int count;
    CircularDoub()
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
            pNode nd=new pNode(value);
            if(head==null)
            {
                head=nd;
                
            }
            else
            {
                pNode t=head;
                while(t.next!=null)
                {
                    t=t.next;
                }
               t.next=nd;
               nd.prev=t;
               last=nd;
            }
            count++;
        }
        
        sc.close();
    }


}

public class CIrcularDoubly {
    
}
