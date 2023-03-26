package Chicken;

public class Main {
    public static void main(String[] args) {
        // creates two variables of the enumerated type Chicken
        Chicken chicken1 = Chicken.HEN;
        Chicken chicken2 = Chicken.ROOSTER;

        // displays initial values to the console
        System.out.println("Chicken 1: " + chicken1);
        System.out.println("Chicken 2: " + chicken2);

        // two instances of the ChickenClass
        ChickenClass c1 = new ChickenClass();
        ChickenClass c2 = new ChickenClass();

        // use mutators (set) to set all instance variables
        c1.setType(Chicken.HEN);
        c1.setName("Hennifer");
        c1.setAge(1);

        c2.setType(Chicken.ROOSTER);
        c2.setName("Bluey");
        c2.setAge(2);

        // use accessors (get) to display the values of all fields
        System.out.println("Chicken 1: " + c1.getType());
        System.out.println("Name: " + c1.getName());
        System.out.println("Age: " + c1.getAge());
        System.out.println("Chicken 2: " + c2.getType());
        System.out.println("Name: " + c2.getName());
        System.out.println("Age: " + c2.getAge());
    }
}
