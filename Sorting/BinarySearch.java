package Sorting;
import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n=sc.nextInt();
      
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
        System.out.println("Enter the element to search");
       int value=sc.nextInt();
       boolean flag=false;
       int low=0,high=n-1,mid;
       for(mid=(low+high)/2;low<=high;mid=(low+high)/2)
       {
        if(arr[mid]==value)
        {
            flag=true;
            break;
        }
        else if(arr[mid]>value)
        {
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
       }
       if(flag==false)
       {
        System.out.println("Not Found");
       }
       
        sc.close();
    }
    
}