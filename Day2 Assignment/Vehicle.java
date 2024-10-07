/* You are building a system to manage vehicles in a parking lot. Create a base class called Vehicle
with attributes registrationNumber and brand. Derive two classes, Car and Motorcycle, from the
Vehicle class. Each derived class should have additional attributes specific to the type of vehicle,
such as numDoors for cars and engineType for motorcycles. Implement methods in each class to
calculate the parking fee for the vehicle based on its type. Create instances of these classes and
calculate the parking fees.*/
package Com.Day2Assignment;

public class Vehicle {
    String registrationNumber;
    String brand;

    public Vehicle(String registrationNumber, String brand){
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }
    public double calculateParkingFee(){
        return 0;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getBrand(){
        return brand;
    }
}
class Car extends Vehicle{
    private int numDoors;

    public Car(String registrationNumber, String brand, int numDoors){
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }
    @Override
    public double calculateParkingFee(){
        return 20;
    }
    public int getNumDoors(){
        return numDoors;
    }
}
class Motorcycle extends Vehicle{
    private String engineType;

    //Constructor
    public Motorcycle(String registrationNumber, String brand, String engineType){
        super(registrationNumber, brand);
        this.engineType = engineType;
    }
    @Override
    public double calculateParkingFee(){
        return 10;
    }
    public String getEngineType(){
        return engineType;
    }
}

public class VehicleMain{
    public static void main(String[] args){
        Car car = new Car("AP1234", "BMW", 2);
        Motorcycle motorcycle = new Motorcycle("TN1234", "Yamaha", "gshvxhgc");

        System.out.println("Car Registration : " + car.getRegistrationNumber() + ", Brand : " + car.getBrand() + ", Doors: " + car.getNumDoors());
        System.out.println("Parking Fee for Car : $" + car.calculateParkingFee());
        System.out.println("Motorcycle Registration : " + motorcycle.getRegistrationNumber() + ", Brand : " + motorcycle.getBrand() + ", Engine : " + motorcycle.getEngineType());
        System.out.println("Parking Fee for Motorcycle : $" +motorcycle.calculateParkingFee());
    }
}