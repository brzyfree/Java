package Flower;

enum Type {SUNFLOWERS, COSMOS, ZINNIAS}
public class Flower {
    int numberPlanted;
    Type type;
    char row;
    
    public Flower(int numberPlanted, Type type, char row) {
        this.numberPlanted = numberPlanted;
        this.type = type;
        this.row = row;
    }

    public void Display() {
        System.out.println("I planted " + numberPlanted + " " + type + " in row " + row);
    }
}
