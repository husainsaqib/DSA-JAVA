package Stack;
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

}