public class Loops {

    public static void main(String[] args) {
        System.out.println(IsEven(2023));
        System.out.println(CountVowels("US Veteran"));
    }
    public static int CountVowels(String str)
    {
        //char[] vowels ={'a', 'A', 'e', 'E', 'i', 'I', 'o' ...};
        String vowels = "aAeEiIoOuU";
        int count = 0;
        //traverse the string
        for(int pos = 0; pos < str.length() ; pos++)
        {
            //check if the character at position pos is a vowel
            //check if str[pos] is a vowel
            if(vowels.indexOf(str.charAt(pos)) !=-1)
            {
                count++; //count it
            }
        }
        return count;
    }
    public static boolean IsEven(int number){
/*      int remainder = number%2; 
        if(remainder == 0)
            return true;
        else
            return false; */
        return number%2 == 0;
    }
}