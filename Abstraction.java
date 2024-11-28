//Hiding implementation details of a method
//encapsulation(data hiding)------abstraction(implementation details hiding)

public class Abstraction {
    public static void main(String[] args) {
        
        Horse horse1 = new Horse();
        horse1.eat();
        horse1.walk();
        horse1.changeColor();
        System.out.println(horse1.color);

        Mustang must = new Mustang();

    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "Brown";
        System.out.println("Animal class");
    }
    void eat(){
        System.out.println("Eats");
    }

    abstract void walk();
}


class Horse extends Animal{
    Horse(){
        System.out.println("Horse class");
    }
    void changeColor(){
        color="Dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang class");
    }
}

