package BinarySearchPatternsAndQuestions;

public class FloorOfANumber {
    public static void main(String[] args) {
        int target=15;
        int[] arr = {1,2,5,7,13,16,22};
        int idx=flooring(arr, target);
        System.out.println("floor of target element "+target+" is "+arr[idx]);
    }
    static int flooring(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        int mid;
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
        return end;
    }
}
