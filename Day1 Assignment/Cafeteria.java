/* Django multiplex is developing application for its cafeteria. The application should be able to
calculate the bill details for the following scenario. You bought pizzas, puffs and cool drinks.
Consider the following prices :
Rs.200/pizza
Rs40/puffs
Rs.120/pepsi
Generate a bill.
The bill details must include the total cost Of pizzas, total cost Of puffs and total cost of pepsi.
Imagine that the inputs are number of pizza bought is 5, number of puffs is 6 and number of cool
drinks is 2. Calculate and display the grand total.  */
package Com.Day1Assignment;

public class CafeteriaBill {
    public static void main(String[] args){
        int pizzaPrice = 200;
        int puffsPrice = 40;
        int pepsiPrice = 120;
        //Now noting the number of items will each item have
        int numberOfPizza = 5;
        int numberOfPuffs = 6;
        int numberOfPepsi = 2;
        //Now calculating the cost of the items individually
        int totalPizzaPrice = pizzaPrice * numberOfPizza;
        int totalPuffsPrice = puffsPrice * numberOfPuffs;
        int totalPepsiPrice = pepsiPrice * numberOfPepsi;
        int totalAllItemsPrice = totalPizzaPrice + totalPuffsPrice + totalPepsiPrice;
        System.out.println("Total pizza price : " +totalPizzaPrice);
        System.out.println("Total puffs price : " +totalPuffsPrice);
        System.out.println("Total pepsi price : " +totalPepsiPrice);
        System.out.println("------------------------");
        System.out.println("The total of all items : " +totalAllItemsPrice);
    }
}