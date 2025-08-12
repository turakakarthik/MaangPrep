package BinarySearch;

//This is when we dont know whether the array is sorted in ascending or descending order
/*To do that simply compare endele & startele
if(startele > endele) then descending else ascending
 */
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]={34,30,25,16,9,4};
        int idx = orderAgnosticBS(arr, 16);
        if(idx==-1)
        {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at idx "+idx);
        }
    }

    static int orderAgnosticBS(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        int mid;
        boolean isAsc=false;
        if(arr[start]<arr[end])
        {
            isAsc=true;
        }
        else
        {
            isAsc=false;
        }

        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }

            if(isAsc==true)
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(target>arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
