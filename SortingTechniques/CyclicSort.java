import java.util.Arrays;
public class CyclicSort
{
    public static void main(String[] args) {
        //Elements should be in the range 1 to N where N=array length
       int[] arr = {3,5,2,1,4}; 
       cyclicSort(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {

        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        // int swapCount=0;
        // int cmpCount=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     while(arr[i]!=i+1)
        //     {
        //         swap(arr,i,arr[i]-1);
        //         swapCount++;
        //     }
        //     cmpCount++;
        // }
        // System.out.println(cmpCount+swapCount);
    }
    static void swap(int[] arr,int idx1,int idx2)
    {
        int tmp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=tmp;
    }
}