import java.util.Arrays;

class ReverseArrayUsingSwap{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int arr1[] = {1,2,3,4,5,6};
        System.out.println("Before Swapping ");
        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("arr1 = "+Arrays.toString(arr1));
        reverseArray(arr);
        reverseArray(arr1);
        System.out.println("After Swapping ");
        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("arr1 = "+Arrays.toString(arr1));
    }
    static void reverseArray(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            swap(arr, start++, end--);
        }
    }
    static void swap(int arr[],int index1,int index2)
    {
        int tmp=arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=tmp;
    }
}