package QUEUES;

class qNode
{
    int data;
    qNode next;
    qNode()
    {
        data=0;
        next=null;

    }
    qNode(int data)
    {
        this.data=data;
        next=null;
    }
}