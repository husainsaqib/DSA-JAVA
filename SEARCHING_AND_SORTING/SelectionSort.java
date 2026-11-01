package SEARCHING_AND_SORTING;

import java.util.Scanner;

public class SelectionSort {
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
        SelectionSort s=new SelectionSort();
        s.selectionSort(arr);
        sc.close();
    }
    void selectionSort(int arr[])
    {
      int min,index;
      for(int i=0;i<arr.length;i++)
      {
        min=arr[i];index=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(min>arr[j])
            {
                index=j;
                min=arr[j];
            }
        }
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
      }
    }
}
