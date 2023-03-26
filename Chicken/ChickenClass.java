package Chicken;

enum Chicken {ROOSTER, HEN, CHICK;} //enumerated type Chicken

public class ChickenClass { //creates chicken class and adds 3 private fields 
    private Chicken type;
    private String name;
    private int age;

    
    public Chicken getType() { //accessor (aka getter, gives read access)
        return type;
    }

    public void setType(Chicken type) { //mutator (aka setter, gives write access)
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
