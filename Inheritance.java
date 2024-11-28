//5 TYPES OF INHERITANCE
//single level inheritance:- SINGLE BASE class with SINGLE DERIVED class
                         
//multi level inheritance:- DERIVED class is BASE CLASS of another DERIVED class
//                           
//heirarchical inheritance:- SINGLE base class with MULTIPLE DERIVED class

//hydrid:- combination of all inheritance

//MULTIPLE INHERITANCE: one class can inherit multiple base classes
//                      not is in java directly, implemented by interface

public class Inheritance {
    public static void main(String[] args) {
        
        Fish f1 = new Fish();
        f1.eat();
        f1.breath();
        f1.swim();

        Bird bird1 = new Bird();
        bird1.fly();
        
        Shark shark1 = new Shark();
        shark1.eat();
        shark1.swim();
        shark1.type();
    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void breath(){
        System.out.println("Breathing");
    }
}

//multilevel inheitance with FISH class. Because, Fish & Bird has single base class Animal
class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}


//single level inheritance
class Fish extends Animal{
    void swim(){
        System.out.println("swimming");
    }
}

//multi level inheritance. subclass of Fish, which is another subclass of Animal
class Shark extends Fish{
    void type(){
        System.out.println("Salt watery fish");
    }
}
