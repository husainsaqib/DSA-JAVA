package SEARCHING_AND_SORTING;
import java.util.Scanner;
public class linearRecursive {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be searched");
        int val=sc.nextInt();
        linearRecursive l=new linearRecursive();
        int result=l.linearSear(arr,val,0);
        if(result==-1)
            System.out.println("Element Not found");
        else
            System.out.println("Element found at Index"+result);
        sc.close();
        
    }
    int linearSear(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return linearSear(arr, key, i+1);
    }
    
}
