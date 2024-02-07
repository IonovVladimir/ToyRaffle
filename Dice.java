import java.util.Random;

public class Dice {
    private int numberOfSides;
    private Random random;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
    }

    public int rollDice() {
        return random.nextInt(numberOfSides) + 1;
    }

    @Override
    public String toString() {
        int rollResult = rollDice();
        return "Бросок кубика на {" + numberOfSides + "} граней и выпало значение " + rollResult + "!";
    }
}
