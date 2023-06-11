import java.util.Scanner;

public class GuessingGame {
    public String randomFood(){
        String[] food = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        int a = food.length;
        a = (int) (Math.random()*a);
        return food[a-1];

    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вітаю вас в грі <Вгадай слово> \n" +
                "Сьогодні вам доведеться зіграти за такими правилами: \n" +
                "1. Ви зможете побачити частину назви їжі на англійскьї мові \n" +
                "2. Вам потрібно буде написати повну назву на англійскій мові \n" +
                "3. Граемо до тих пір, поки не вгадаешь!");
        while (true){
            String food = randomFood();
            String receivedFood = food.substring(0,2)+"###############";
            System.out.println("Загадана назва: "+receivedFood);
            System.out.println("Ваша відповідь? ");
            String playerChoice = scanner.next();
            if (playerChoice.equalsIgnoreCase(food)){
            System.out.println("Ви вгадали!"); break;}
            else {
                System.out.println("Ви не вгадали. Навзвою було: "+ food+ " Спробуй ще");
            }
        }
    }

}
