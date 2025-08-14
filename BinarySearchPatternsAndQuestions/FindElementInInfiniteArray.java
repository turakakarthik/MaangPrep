package BinarySearchPatternsAndQuestions;

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,13,21,23,24,31,42};
        int ans= range(arr,42);
        System.out.println("Target found at "+ans);
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
    static int range(int arr[],int target)
    {
        int start=0,end=1;
        while(target > arr[end])
        {
            int newStart=end+1;
            end = end + (end-start+1);
            start = newStart;
        }
        return binarySearch(arr, start, end, target);
    }
}

