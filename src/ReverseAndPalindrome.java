public class ReverseAndPalindrome {
    public String stringReverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();

    }
    public boolean isPalindrome (String palindrome){
        StringBuilder builder = new StringBuilder(palindrome.toLowerCase().replaceAll("[^a-zа-я]", ""));
        palindrome = String.valueOf(builder);
        builder.reverse();
        System.out.println(builder);
        return String.valueOf(builder).equals(palindrome);
    }
}
