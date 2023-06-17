import java.util.Scanner;

public class GuessingGame {
    public String randomFood() {
        String[] food = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        int a = food.length;
        a = (int) (Math.random() * a);
        return food[a - 1];

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вітаю вас в грі <Вгадай слово> \n" +
                "Сьогодні вам доведеться зіграти за такими правилами: \n" +
                "1. Ви зможете побачити частину назви їжі на англійскьї мові \n" +
                "2. Вам потрібно буде написати повну назву на англійскій мові \n" +
                "3. Граемо до тих пір, поки не вгадаешь!");
        String food = randomFood();
        String code = "###############";
        System.out.println("Загадана назва: " + code);
        while (true) {
            System.out.println("Ваша відповідь? ");
            String playerChoice = scanner.next();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < food.length(); i++) {
                char guessedChar = (i < playerChoice.length()) ? playerChoice.charAt(i) : '#';
                char secretChar = food.charAt(i);

                if (guessedChar == secretChar) {
                    result.append(guessedChar);
                } else {
                    result.append("#");
                }
            }
            result.append(code);
            System.out.println(result.subSequence(0,14));
            if (playerChoice.equalsIgnoreCase(food)) {
                System.out.println("Ви вгадали!");
                break;
            } else {
                System.out.println("Ви не вгадали, спробуй ще");
            }
        }
    }

}
