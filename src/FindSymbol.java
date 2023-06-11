import java.util.Scanner;

public class FindSymbol {
    public void findSymbol(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть символ, що шукаете");
        String symbol;
        do {
            System.out.print("Введіть лише один символ: ");
            symbol = scanner.nextLine();
        } while (symbol.length()!=1);

        System.out.println("Ви символ: " + symbol);
        char conventSign = symbol.charAt(0);
        System.out.println("Введіть строку, в якій хочете знайти символ");
        String word = scanner.nextLine();
        System.out.println("Ви ввели строку <"+word+"> в якій  знайшли символ "+conventSign+" "
                +findSymbolOccurrence(word, conventSign)+" разів");
        scanner.close();
    }
    public static int findSymbolOccurrence(String str, char symbol) {
        int count = 0;
        int i = 0;
        while (i < str.length()){
            if (str.charAt(i) == symbol) {
                count++;

            }i++;
        }
        return count;}
}
