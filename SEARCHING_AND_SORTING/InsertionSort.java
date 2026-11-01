package SEARCHING_AND_SORTING;

import java.util.Scanner;

public class InsertionSort {
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
        InsertionSort s=new InsertionSort();
        s.insertionsort(arr);
        sc.close();
    }
    void insertionsort(int arr[])
    {int key;
        for(int i=0;i<arr.length;i++)
        {
            key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
             for(int i=0;i<arr.length;i++)
        {
           System.out.println(arr[i]);
        }
    }
}
