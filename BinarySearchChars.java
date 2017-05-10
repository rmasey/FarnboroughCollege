public class BinarySearchChars
{ 
    public static void main(String[] args) 
    {
        char[] letters = {'A', 'B', 'C', 'D', 'F'};      
        char searchItem = 'Z';

        System.out.println(binarySearch(letters, searchItem));

    }

    public static boolean binarySearch(char[] letters, char searchItem)  //boolean primitive true/false, Boolean true, false, null
    {
        int start = 0;
        int end = (letters.length)-1;
        boolean found = false;

        while (found==false && start<=end ){
            int midPoint = (start + end)/2;
            if (letters[midPoint] == searchItem){
                found = true;
                return found;
            } else if (letters[midPoint]> searchItem){
                end = midPoint -1;
            } else 
                start = midPoint + 1;
        }

        return found;
    }
}