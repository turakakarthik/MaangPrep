package BinarySearchPatternsAndQuestions;
//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        //we need to return smallest index of target
        int peakIndex = peakIndexInMountainArray(arr);
        int idx1 = binarySearchAsc(arr,0,peakIndex,target);
        int idx2 = binarySearchDesc(arr, peakIndex+1,arr.length-1 , target);
        System.out.println("Idx1 is "+idx1+" Idx2 is "+idx2);
    }
    static int binarySearchAsc(int arr[],int start,int end,int target)
    {
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
    static int binarySearchDesc(int arr[],int start,int end,int target)
    {
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
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        int mid;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
        }
        return start;
    }
}
