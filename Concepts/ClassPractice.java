// Objects, access modifier, encapsulation practice
public class ClassPractice{

    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        p1.setPrice(10);
        System.out.println(p1.price);

        BankAcc acc = new BankAcc();
        acc.username="asd";
        acc.setPass("New password");
        // acc.pass="password";

        Constructor c1 = new Constructor("Mahdi", 23);


        Student s1 = new Student("Hasib", 234);
        System.out.println("S1 Name "+s1.name+"SS1 ID: "+s1.id);

        Student s2 = new Student(s1);
        s2.name = "Shabab";
        System.out.println("\nS2 Name: "+s2.name+" S2 ID "+s2.id);
    }
}


class Student{
    String name;
    int id;
//parametarized constructor
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
//copy constructor
    Student(Student s){
        this.name = s.name;
        this.id = s.id;
    }
//non-parameterized constructor
    Student(){
        System.out.println("Student object is created");
    }
    
}

class Constructor{
    String name;
    int age;
    Constructor(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name "+name+"\n Age "+age);
    }
}


class BankAcc{
    String username;
    private String pass;

    public void setPass(String pwd){
        this.pass = pwd;
    }
    public String getPass(){
        return pass;
    }
    
}


class Pen {
    String color;
    int price;

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        this.price = price;
    } 
}