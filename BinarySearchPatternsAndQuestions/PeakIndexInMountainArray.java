package BinarySearchPatternsAndQuestions;
//https://leetcode.com/problems/find-peak-element/description/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3};
        int ansIdx = peakIndexInMountainArray(arr);
        System.out.println("Peak Element is "+arr[ansIdx]+" found at idx "+ansIdx);
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
