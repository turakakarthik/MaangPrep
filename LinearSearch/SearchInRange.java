package LinearSearch;

public class SearchInRange {
    public static void main(String args[])
    {
        int[] arr = {1,3,4,67,54,12,13};

        boolean idx = linearSearch(arr,67,2,5);
        if(idx==true)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not found");
        }
    }

    static boolean linearSearch(int[] arr,int target,int start,int end)
    {
        if(arr.length== 0)
        return false;

        for(int i=start;i<=end;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }
}
