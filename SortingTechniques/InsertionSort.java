import java.util.Arrays;
public class InsertionSort{
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int arr[])
    {
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
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