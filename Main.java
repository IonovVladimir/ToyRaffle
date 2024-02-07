import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Розыгрыш!");

        List<Toy> toys = new ArrayList<>();
        toys.add(new Toy(1, "Booba", 50, 10));
        toys.add(new Toy(2, "Biba", 50, 10));
        toys.add(new Toy(3, "Bobr", 20, 5));
        toys.add(new Toy(4, "Red tractor", 10, 20));
        toys.add(new Toy(5, "Monopoly", 30, 30));
        toys.add(new Toy(6, "The railway", 15, 100));


        //Проверка списка
        for (int i=0; i < toys.size(); i++){
            System.out.println(toys.get(i));
        }

        System.out.println(toys.size() + " призов в розыгрыше!!");


        Dice dice = new Dice(toys.size());
        int diceResult = dice.rollDice();
        System.out.println("Бросок кубика: " + diceResult);

        Toy winningToy = toys.get(diceResult - 1); // нумерация игрушек начинается с 1, а не с 0

        System.out.println("Разыгрываемая игрушка: " + winningToy.getName());

        // Проверяю, выиграл ли пльзователь игрушку?
        if (Chance(winningToy.getWeight())) {
            System.out.println("Поздравляем! Вы выиграли " + winningToy.getName() + "!");
            // Уменьшаю количество выигранной игрушки на складе
            winningToy.decreaseQuantity(1);
            System.out.println("Остаток игрушек " + winningToy.getName() + ": " + winningToy.getQuantity());
        } else {
            System.out.println("К сожалению, вы не выиграли " + winningToy.getName() + ":(");
        }

        ///проверка на колличество
        for (int i=0; i < toys.size(); i++){
            System.out.println(toys.get(i));
        }
    }

    public static boolean Chance(double chance) {
        int r = (int) (Math.random() * 100);
        return r < chance;
    }
}
