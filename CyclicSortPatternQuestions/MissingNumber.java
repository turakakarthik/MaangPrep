package CyclicSortPatternQuestions;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        cyclicSort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
        }
        return nums.length;
    }
    static void cyclicSort(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i];
            if(correct==arr.length)
            {
                i++;
                continue;
            }
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
        int tmp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=tmp;
    }
}
