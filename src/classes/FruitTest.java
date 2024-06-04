package classes;

public class FruitTest {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.name = "Mango";
        fruit.color = "Yellow";
        fruit.taste = "sweet";
        fruit.price = 2.99;
        fruit.eatFruit();

        Fruit fruit1 = new Fruit();

        fruit.name = "Orange";
        fruit.color = "orange";
        fruit.taste = "sweet";
        fruit.price = 2.65;

        fruit.eatFruit();

    }
}