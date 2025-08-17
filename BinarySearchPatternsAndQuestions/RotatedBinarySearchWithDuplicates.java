package BinarySearchPatternsAndQuestions;

public class RotatedBinarySearchWithDuplicates {
    static int findPivotWithoutDuplicates(int arr[])
    {
        int start=0,end=arr.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            //four cases over here
           // System.out.println("start is "+start+" end is "+end+" mid is "+mid);
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid>start && arr[mid-1]>arr[mid])
            {
                return mid-1;
            }
            
            //if start,mid and end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end])
            {
                //skio the duplicates
                //Note: What if these elements at start and end are pivot just check
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;

                //check whether end is pivot
                if(arr[end]<arr[end-1])
                {
                    return end;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end]))
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}

