package BinarySearch;

public class BinarySearchCode {
    public static void main(String args[])
    {
        int arr[] = {-3,1,3,5,6,8};
        int idx = binarySearch(arr, 5);
        if(idx==-1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at idx "+idx);
        }
    }
    static int binarySearch(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        int mid;
        while(start<=end)
        {
            // if we do (start+end) there might be problem of exceeding integer range
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
        return -1;
    }
}
