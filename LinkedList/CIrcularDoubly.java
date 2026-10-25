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
                head=last=nd;
                
            }
            else
            {
               
                nd.prev=last;
                nd.next=head;
                last.next=nd;

                last=nd;
            } 
            count++;
        }

        sc.close();
    }


}

public class CIrcularDoubly {
    
}
