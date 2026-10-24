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
   }
   count=l;
    
}

public class ArrayList1 {
    public static void main(String[] args) {
        
    }
}
