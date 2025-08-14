package BinarySearchPatternsAndQuestions;

import java.util.Arrays;

public class FirstAndLastOccurenceOfANumber {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target=8;
        int[] ans=firstAndLastOccurence(arr, target);
        System.out.println("Ans is "+Arrays.toString(ans));
    }
    static int[] firstAndLastOccurence(int[] arr,int target)
    {
        int ans[] = {-1,-1};
        int start=0,end=arr.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans[0]=mid;
                end=mid-1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        start=0;end=arr.length-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans[1]=mid;
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
