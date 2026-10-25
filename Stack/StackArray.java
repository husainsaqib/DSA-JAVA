
class StackArray
{
    int arr[];
    int max;
    int top;
    StackArray()
    {
        max=8;
        arr=new int[max];
        top=-1;

    }
    StackArray(int max)
    {
        this.max=max;
        arr=new int[max];
        top=-1;
    }
    boolean isEmpty()
    {
         if(top==-1)
            return true;
        else
            return false;
    }
    boolean isFull()
    {
        if(top==max-1)
            return true;
        else
            return false;
    }
    void push(int value)
    {
        if(isFull())
            System.out.println("Stack overflow");
        else
        {
            arr[++top]=value;
        }
    }
    int pop()
    {    int data=0;
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return data;
        }
        else
        {
            return arr[top--];
        }
    }
    void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}