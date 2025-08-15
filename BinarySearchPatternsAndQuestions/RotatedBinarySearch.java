package BinarySearchPatternsAndQuestions;

//33.https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int pivot = findPivot(arr);
        int target=0,start=0;
        if(pivot == -1)
        {
            //return binarySearch(arr,0,arr.length-1,0);
            int idx = binarySearch(arr,0,arr.length-1,0);
            System.out.println("Element found at "+idx);
        }
       // System.out.println("pivot element is "+arr[pivot]);
       //adding furthur optimization
       if(arr[pivot]==target)
       {
         //return pivot;
         System.out.println("Element found at "+pivot);
       }
       else if(target>arr[start])
       {
         int idx = binarySearch(arr, start, pivot-1, target);
        // return idx;
         System.out.println("Element found at "+idx);
       }
       else if(target<arr[start])
       {
         int idx = binarySearch(arr, pivot+1,arr.length-1, target);
         //return idx;
         System.out.println("Element found at "+idx);
       }
       else{
            int idx1 = binarySearch(arr, 0,pivot,target);
            int idx2 = binarySearch(arr, pivot+1,arr.length-1,target);
            if(idx1 == -1 && idx2 == -1)
            {
                System.out.println("Element not found");
                // return -1;
            }
            if(idx1 != -1){
                System.out.println("Element found at "+idx1);
            // return idx1;
            }
            else{
                System.out.println("Element found at "+idx2);
                //return idx2;
            }
        }
    }
    static int binarySearch(int arr[],int start,int end,int target)
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
    static int findPivot(int arr[])
    {
        int start=0,end=arr.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
           // System.out.println("start is "+start+" end is "+end+" mid is "+mid);
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid>start && arr[mid-1]>arr[mid])
            {
                return mid-1;
            }
            else if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else if(arr[start]<arr[mid])
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
