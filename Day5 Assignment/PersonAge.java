/* Write a Java program that gets a person's date Of birth as input and calculates his/her
age and display the age, The program should also check whether the person is an adult Or
child, Display the results as given in the sample output.
• Create a class called Person.
1. Populate the Person class with the following private fields. :
String firstName // stores the first name of the person
String lastName //stores the last name of the person
DateTime dob // stores the date Of birth Of the person
2. Add read-write properties for the above three instance fields and Store the information
3. Add read-only property Adult that return the following computed information:
Public String Adult // Check the age of the person. And if he is 18 or above return
a string •Adult' and if he is below 18 return 'Child’.
4. Include a Method DisplayDetails
public void DisplayDetails() // Displays the details of the person */
package Com.Day5Assignment;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    
    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getAdult() {
        return getAge() >= 18 ? "Adult" : "Child";
    }
    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }
    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + getAge());
        System.out.println(getAdult());
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter date of birth in yyyy/mm/dd format: ");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);
        Person person = new Person(firstName, lastName, dob);
        person.displayDetails();
        scanner.close();
    }
}
