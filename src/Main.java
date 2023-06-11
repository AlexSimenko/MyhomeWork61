import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessingGame guessingGame = new GuessingGame();
        System.out.println(guessingGame.randomFood());
        System.out.println(guessingGame.encryption());

        System.out.println("Введіть строку, що хочете знайти в слові");
        String target = scanner.nextLine();
        System.out.println("Введіть строку, що перевіряеться ");
        String source = scanner.nextLine();

        WordPosition wordPosition = new WordPosition();
        System.out.println("Result: "+wordPosition.findWordPosition(source, target));

        FindSymbol findSymbol = new FindSymbol();
        findSymbol.findSymbol();
        ReverseAndPalindrome reverseAndPalindrome = new ReverseAndPalindrome();
        String wordRev;
        boolean isTrue = true;
        /*do {
            System.out.println("Введіть слово");
            wordRev = scanner.nextLine();

            System.out.println("Ваше слово: "+wordRev+"\n" +
                    "Ви можете перевернути ваше слово і перевірити чи є воно паліндромом\n"+
                    "Для цього виберіть, що хочете зробити \n"+
                    "пропишіть <reverse> для того, щоб перевернути вашу введену строку\n"+
                    "пропишіть <palindrome> для того, щоб перевернути вашу введену строку\n");
        }
        while (isTrue); {
            String choose = scanner.nextLine();


        if ((choose.equalsIgnoreCase("reverse"))){
            System.out.println("Результат перевертання строки <"+reverseAndPalindrome.stringReverse(wordRev)+">");
            isTrue = false;
        }
        if (choose.equalsIgnoreCase("palindrome")){
            System.out.println(reverseAndPalindrome.isPalindrome(wordRev));
            isTrue = false;

        }



        }*/
}}