package LinearSearch;

public class LinearSearch1 {
    public static void main(String args[])
    {
        int[] arr = {1,3,4,67,54,12,13};

        boolean idx = linearSearch(arr,12);
        if(idx==true)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not found");
        }
    }

    static boolean linearSearch(int[] arr,int target)
    {
        if(arr.length== 0)
        return false;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }

}
