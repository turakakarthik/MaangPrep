package CyclicSortPatternQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> al = new ArrayList<>();
        cyclicSort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                al.add(i+1);
            }
        }
        return al;
    }
    static void cyclicSort(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]==arr[correct])
            {
                i++;
            }
            else
            {
                swap(arr,i,correct);
            }
        }
    }
    static void swap(int arr[],int idx1,int idx2)
    {
        int tmp = arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=tmp;
    }
}
