package CyclicSortPatternQuestions;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        return cyclicSort(nums);
    }
    static int cyclicSort(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]==arr[correct])
            {
                if(i!=correct)
                {
                    return arr[i];
                }
                i++;
            }
            else
            {
                swap(arr,i,correct);
            }
        }
        return -1;
    }
    static void swap(int arr[],int idx1,int idx2)
    {
        int tmp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=tmp;
    }
}
