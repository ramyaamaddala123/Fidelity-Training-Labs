/* Create a person class with attributes name,gender and age. Consider name as private and other
two are having public access specifier. In what way, you access private variable. Finally, display the
person details.*/
package Com.Day2Assignment;

public class Person {
    private String name;
    public String gender;
    public int age;
    //Constructor to initialize Person object
    public Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //We use getter method to access the private variable name
    public String getName(){
        return name;
    }
    //We use setter method to modify the private method variable name
    public void setName(String name){
        this.name = name;
    }
    public void displayPersonDetails(){
        System.out.println("Name : " +getName());
        System.out.println("gender : " +gender);
        System.out.println("age : " +age);
    }
}

public class personMain{
    public static void main(String[] args){
        Person person1 = new Person("Ramya", "Female", 22);
        person1.displayPersonDetails();
        System.out.println();

        //Accessing and modifying the private "name" using setter method

        person1.setName("Ramya Maddala");
        person1.displayPersonDetails();
    }
}