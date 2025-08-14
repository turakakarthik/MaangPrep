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
        int start = search(arr, target, true);
        int end;
        if(start==-1)
        {
            end=-1;
        }
        else
        {
            end =search(arr, target, false);
        }
        return new int[]{start,end};
    }   
    static int search(int[] arr,int target,boolean firstIndexSearch)
    {
        int start=0,end=arr.length-1;
        int mid,ans=-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                if(firstIndexSearch)
                end=mid-1;
                else
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
