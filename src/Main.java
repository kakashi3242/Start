class Fruit {
    enum FruitSize {SMALL, LARGE}

    FruitSize size;
}


public class Main {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.size = Fruit.FruitSize.LARGE;

        System.out.println("The fruit size is " + fruit.size);
    }
}
