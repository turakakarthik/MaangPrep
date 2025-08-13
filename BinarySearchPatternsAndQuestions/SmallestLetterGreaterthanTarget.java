package BinarySearchPatternsAndQuestions;
//744.https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetterGreaterthanTarget {
    public static void main(String[] args) {
        char[] arr1 = {'c','f','j'};
        char target1 = 'a';
        char ans1 = nextGreatestChar(arr1,target1);
        System.out.println("smallest element greater than target "+target1+" is "+ans1);
        char[] arr2 = {'a','b'};
        char target2 = 'z';
        char ans2 = nextGreatestChar(arr2,target2);
        System.out.println("smallest element greater than target "+target2+" is "+ans2);
    }
    public static char nextGreatestChar(char[] letters,char target)
    {
       int start=0,end=letters.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(target < letters[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
