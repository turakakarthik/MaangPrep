package SortingTechniques;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,5,1,4,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int arr[],int start,int last)
    {
        int max=start;
        for(int i=start;i<=last;i++)
        {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        return max;
    }
    static void swap(int arr[],int idx1,int idx2)
    {
        int tmp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=tmp;
    }
}
