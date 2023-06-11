import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessingGame guessingGame = new GuessingGame();
        guessingGame.start();

        System.out.println("Зараз ви змотеже знайти індекс початку сегменту в рядку \n" +
                "Будь-ласка, впишіть сегмент, що хочете знайти");
        String target = scanner.nextLine();
        System.out.println("Введіть рядок, що перевіряеться для пошуку");
        String source = scanner.nextLine();

        WordPosition wordPosition = new WordPosition();
        System.out.println("Result: "+wordPosition.findWordPosition(source, target));
        System.out.println("Зараз ви змотеже перевірити рядок на кількість повторень введеного символу");
        FindSymbol findSymbol = new FindSymbol();

        findSymbol.findSymbol();
        ReverseAndPalindrome reverseAndPalindrome = new ReverseAndPalindrome();
        System.out.println("Введіть рядок для для того, що його перевернути");
        String strRevers = scanner.nextLine();
        System.out.println("Ва рядок до <"+strRevers+"> результат: <"+reverseAndPalindrome.stringReverse(strRevers)+">");
        System.out.println("Введіть рядок і ви зможете перевірити чи є він паліндромом");
        String strPalindrome = scanner.nextLine();
        System.out.println(strPalindrome+" -> "+reverseAndPalindrome.isPalindrome(strPalindrome));







        }
}