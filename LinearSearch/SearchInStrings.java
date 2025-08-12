package LinearSearch;
class SearchInStrings{
    public static void main(String args[])
    {
        String str = "Karthik";
        char ch='u';
        boolean found = searchCharInString(str, ch);
        if(found==true)
        {
            System.out.println("Character found");
        }
        else{
            System.out.println("Character Not Found");
        }
    }

    static boolean searchCharInString(String str,char ch)
    {
        if(str.length()==0)
        return false;

        for(char c:str.toCharArray())
        {
            if(c==ch)
            {
                return true;
            }
        }
        return false;
    }
}