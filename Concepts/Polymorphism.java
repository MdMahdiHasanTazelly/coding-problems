//compile time polymorphism: METHOD OVERLOADING(static)
//                           happens within a class
//                           same name, different no of parameters/ data types

//run time polymorphism: METHOD OVERRIDING(dynamic)
//                       happens within child & parent class
//                       func defination must be same
public class Polymorphism {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.sum(2,3));
        System.out.println(calc.sum(2.5, 3.5));
        System.out.println(calc.sum(2, 3, 4));

        Animal ani = new Animal();
        ani.eat();
    }
}
//method overriding (run time polymorphism)
class Animal{
    void eat(){
        System.out.println("Eat everything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat grass only");
    }
}

//method overloading (compile time polymorphism)
class Calculator{
    
    int sum(int x, int y){
        return x+y;
    }

    double sum(double x, double y){
        return x+y;
    }

    int sum(int x, int y, int z){
        return x+y+z;
    }
}
