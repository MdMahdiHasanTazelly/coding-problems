//Interface:- blueprint of class
//class:- blueprint of object
//implements MULTIPLE INHERITANCE + total abstraction

public class Interface {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.blood();
        d.moves();

        Fish f = new Fish();
        f.moves();
    }
}

interface Animal{
    void moves();
}

interface Mammal {
    void blood(); 
}

// multiple inheritance
class Deer implements Animal, Mammal {
    public void blood(){
        System.out.println("Mammal has warm blood");
    }
    public void moves(){
        System.out.println("Deer moves by walking");
    }
}

class Fish implements Animal{
    public void moves(){
        System.out.println("Fish moves by swimming");
    }
}
