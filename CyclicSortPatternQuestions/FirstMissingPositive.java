package CyclicSortPatternQuestions;

public class FirstMissingPositive {
    public static void main(String args[])
    {
        int[] arr = {7,8,9,10,11};
        int firstMissingpositive=  firstMissingPositive(arr);
        System.out.println(firstMissingpositive);
    }
    public static int firstMissingPositive(int[] arr) {
        cyclicSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                return i+1;
            }
        }
        return arr.length+1;
    }
    static void cyclicSort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct;
            if(arr[i]<=0 || arr[i]>=arr.length)
            {
                i++;
                continue;
            }
            else{
                correct=arr[i]-1;
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
    static void swap(int[] arr,int idx1,int idx2)
    {
        int tmp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=tmp;
    }
}
