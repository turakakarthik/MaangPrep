package BinarySearchIn2DArray;

import java.util.Arrays;

public class BSInBothRowAndColWiseSorted {
    public static void main(String[] args) {
        int[][] arr = {{20,30,30,40},
                       {15,25,35,45},
                       {28,29,37,49},
                       {33,34,38,50}};
        int target=29;
        int[] indexes = binarySearchin2DMatrix(arr, target);
        if(indexes[0]==0)
        {
            System.out.println(target+" not found");
        }
        else{
            System.out.println(target+" found at "+Arrays.toString(indexes));
        }
    }
    static int[] binarySearchin2DMatrix(int[][] arr,int target)
    {
        int row=0,col=arr[0].length-1;
        while(row<=arr.length-1 && col>=0)
        {
            if(target<arr[row][col])
            {
                col--;
            }
            else if(target>arr[row][col])
            {
                row++;
            }
            else if(arr[row][col]==target)
            {
                return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }

}
