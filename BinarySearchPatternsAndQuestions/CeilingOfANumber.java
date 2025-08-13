package BinarySearchPatternsAndQuestions;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,12,16,21};
        int target=15;
        int idx = ceiling(arr, target);
        System.out.println("Ceiling of target element "+target+" is "+arr[idx]);
    }
    static int ceiling(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        int mid;
        if(target > arr[end])
        {
            return -1;
        }
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
               return mid;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return start;
    }
}
