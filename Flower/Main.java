package Flower;

public class Main {
    public static void main(String[] args) {
        Flower Flower1 = new Flower(72, Type.COSMOS, 'B');
        Flower Flower2 = new Flower(50, Type.ZINNIAS, 'C');
        Flower Flower3 = new Flower(1000, Type.SUNFLOWERS, 'E');

        Flower1.Display();
        Flower2.Display();
        Flower3.Display();

    }
}
