package BinarySearchIn2DArray;

import java.util.Arrays;

public class BSIn2DSortedArray{
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int ans[]= search(arr, 13);
        System.out.println(Arrays.toString(ans));
    }
    //search in the row provided between the cols provided
    static int[] binarySearch(int arr[][],int row,int colstart,int colend,int target)
    {
        while(colstart <= colend)
        {
            int mid=colstart+(colend-colstart)/2;
            if(arr[row][mid]==target)
            {
                return new int[]{row,mid};
            }
            else if(target < arr[row][mid])
            {
                colend=mid-1;
            }
            else{
                colstart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows==1)
        {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        //run the loop till two rows are remainings
        int rowStart=0,rowEnd=rows-1,colMid=cols/2;
        while(rowStart < (rowEnd-1))
        {
            int mid = rowStart+(rowEnd-rowStart)/2;
            if(matrix[mid][colMid]==target)
            {
                return new int[]{mid,colMid};
            }
            if(matrix[mid][colMid]<target)
            {
                rowStart=mid;
            }
            else{
                rowEnd=mid;
            }
        }
        //Now we have two rows
        //check if the one of two elements in the midcolumn 
        if(matrix[rowStart][colMid] == target)
        {
            return new int[]{rowStart,colMid};
        }
        if(matrix[rowStart+1][colMid] == target)
       {
            return new int[]{rowStart+1,colMid};
       }

       //search in first half
       if(target<=matrix[rowStart][colMid-1])
       {
        return binarySearch(matrix, rowStart, 0, colMid-1, target);
       }
       //search in second half
        if(target>=matrix[rowStart][colMid+1] && target<=matrix[rowStart][cols-1])
       {
        return binarySearch(matrix, rowStart, colMid+1,cols-1 , target);
       }
       //search in third half
       if(target<=matrix[rowStart+1][colMid-1])
       {
         return binarySearch(matrix, rowStart+1, 0, colMid-1, target);
       }
       //search in fourth half
        if(target>=matrix[rowStart+1][colMid+1] && target<=matrix[rowStart+1][cols-1])
       {
        return binarySearch(matrix, rowStart+1, colMid+1,cols-1 , target);
       }

       return new int[]{-1,-1};
    }
}