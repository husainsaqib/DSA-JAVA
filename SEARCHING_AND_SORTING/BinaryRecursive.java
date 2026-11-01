package SEARCHING_AND_SORTING;

import java.util.Scanner;

public class BinaryRecursive {
    public static void main(String[] args) {
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
        BinaryRecursive b=new BinaryRecursive();
        int result=b.binarySear(arr,val,0,arr.length-1);
        if(result==-1)
            System.out.println("Element Not found");
        else
            System.out.println("Element found at Index"+result);
        sc.close();
    }
    int binarySear(int arr[],int key,int low,int high)
    {
        if(low>high)
        {
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(arr[mid]>key)
        {
            return binarySear(arr, key, mid+1, high);
        }
        else
        {
            return binarySear(arr, key, low, mid-1);
        }

    }
    
}
