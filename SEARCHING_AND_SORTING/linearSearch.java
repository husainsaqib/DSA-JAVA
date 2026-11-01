package SEARCHING_AND_SORTING;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++ )
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to search");
        int val=sc.nextInt();
        linearSearch m=new linearSearch();
        m.linearSearching(arr,val);
        sc.close();

    }
    void linearSearching(int arr[],int val)
    {
      boolean flag=false;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==val)
        {
            flag=true;
            break;
        }


      }
      if(flag==true)
      {
        System.out.println("ELement found");
      }
      else
      {
        System.out.println("Not found");
      }
    }

}
