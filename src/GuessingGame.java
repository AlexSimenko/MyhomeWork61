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
    public String encryption(){
        String receivedFood = randomFood();
        System.out.println(receivedFood);
      String food = receivedFood.substring(0,2);
        return String.format(food,"%s","###############" );
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вітаю вас в грі <Вгадай Їжу> \n" +
                "Сьогодні вам доведеться зіграти за нашими правилами \n" +
                "1. Ви зможете побачити частину назви їжі на англійскьї мові \n" +
                "2. Вам потрібно буде написати повну назву на англійскій мові \n" +
                "3. Граемо до тих пір, поки не вгадаешь!");
        while (true){
            String food = encryption();
            System.out.println("Загадана назва: "+food);
            String playerChoice = scanner.nextLine();
            if (playerChoice.equalsIgnoreCase(food)){
            System.out.println("Ви вгадали!"); break;}
        }
    }

}
