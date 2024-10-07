/* Implement Hierarchical inheritance with an example */
package Com.Day2Assignment;

public class ElectronicDevices {
    public void settings(){
        System.out.println("Electronic devices have settings");
    }
    public void cost(){
        System.out.println("Electronic devices cost");
    }
}
class Laptop extends ElectronicDevices{
    public void displaySettings(){
        System.out.println("Laptop has displaySettings");
    }
}
class Mobile extends ElectronicDevices{
    public void electronicsCost(){
        System.out.println("Mobile is very costly");
    }
}
class ElectronicMain{
    public static void main(String[] args){
        Laptop l = new Laptop();
        l.settings();
        l.displaySettings();
        Mobile m = new Mobile();
        m.cost();
        m.electronicsCost();
    }
}