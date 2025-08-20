
import java.util.Arrays;

/*
 * Buuble sort is also known as Sinking Sort or Exchange Sort
 * No extra space needed 
 * Space complexity = O(1)
 * Time Complexity
 * Best Case : O(N) - sorted Array ->Actually N-1 constants are ignored we only need relation
 * Worst Case : O(N2) - sorted in opposite way
 * 
 * As the input grows how the time grows - time complexity
 * 
 * Best Case
 * -------------
 * If j never swap for a value of i , then the array is sorted
 * 
 * Stable Sorting vs unstable sorting in img
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Before Sorting arr = "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting arr = "+Arrays.toString(arr));
        int[] arr1 = {1,4,2,5,3,6};
        System.out.println("Before Sorting arr = "+Arrays.toString(arr1));
        bubbleSort(arr1);
        System.out.println("After Sorting arr = "+Arrays.toString(arr1));
    }
    static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean isSorted=true;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    isSorted=false;
                }
            }
            if(isSorted==true)
            {
                System.out.println("Array is sorted at i = "+i);
                return;
            }
        }
    }
}
