/* Implement Multilevel inheritance with an example. */
package Com.Day2Assignment;

public class Animal {
    public void eat(){
        System.out.println("Animal can eat");
    }
}
class Bird extends Animal{
    public void see(){
        System.out.println("Bird can see");
    }
}
class Dog extends Bird{
    public void run(){
        System.out.println("Dog can run");
    }
}
class AnimalMain{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.see();
        dog.run();
    }
}