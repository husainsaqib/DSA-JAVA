package ArrayList;
import java.util.Scanner;
class ArrayList2 {
   int arr[];
   int max;
   int count;
   ArrayList2()
   {
    max=8;
    arr=new int[max];
    count=0;
   }
   ArrayList2(int max)
   {
    this.max=max;
    arr=new int[max];
    count=0;
   }
   void updatecapacity()
   {
    if(count==max)
        max=2*max;
   }
   void create(int n)
   {
      Scanner sc=new Scanner(System.in);
    while(count+n>=max)
    {
        updatecapacity();
    }
  int l=count+n;
     for(int i=0;i<l;i++)
     {
        arr[i]=sc.nextInt();
     }
     count=l;
     sc.close();
   }
  void append(int value)
  {
    if(count>=max)
    {
         updatecapacity();
    }
    arr[count]=value;
    count++;
  }
  void insertAtPosition(int pos,int value)
  {
    if(pos>count)
        System.out.println("Invalid position");
    else if(count==max)
    {
        updatecapacity();
    }
    else
    {
        for(int i=count;i>pos;i--)
           arr[i]=arr[i-1];
        arr[pos]=value;
    }

    
  }
  int size()
  {
    return count;
  }
  int capacity()
  {
    return max;
  }
  void remove()
  {
      arr[count-1]=0;
      count--;
  }
  void remove(int pos)
  {
    if(count-1<pos)
        System.out.println("Invalid Position");
    else
    {
        for(int i=pos;i<count;i++)
        {
            arr[i]=arr[i+1];
        }
        count--;
    }
    
  }
  void display()
  {
    for(int i=0;i<count;i++)
    {
        System.out.println(arr[i]);
    }
  }
    
}

public class ArrayList1 {
    public static void main(String[] args) {
        
    }
}
