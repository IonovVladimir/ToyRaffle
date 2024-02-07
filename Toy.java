public class Toy {

    private String name;
    private double weight;
    private int quantity; // колличество на складе
    private int id_toy;

    public Toy(int id_toy, String name, double weight, int quantity) {
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
        this.id_toy = id_toy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId_toy() {
        return id_toy;
    }

    public void setId_toy(int id_toy) {
        this.id_toy = id_toy;
    }

    // управление весом в %

    public double getWeightPercentage() {
        return weight * 100;
    }

    public void setWeightPercentage(double weightPercentage) {
        this.weight = weightPercentage / 100;
    }

    //управление количеством игрушек на складе
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        if (amount <= this.quantity) {
            this.quantity -= amount;
        } else {
            System.out.println("Недостаточное количество игрушек на складе.");
        }
    }

    @Override
    public String toString() {
        return "id: "+id_toy+" Name: "+ name+" weight: "+weight+ " quantity: "+quantity;
    }
}
