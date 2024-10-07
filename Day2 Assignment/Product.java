/* Create a product class having proid, proname and price as data members and display as a member
function. Display 5 products with its details. */
package Com.Day2Assignment;

public class Product {
    private int proId;
    private String proName;
    private double price;

    public Product(int proId, String proName, double price) {
        this.proId = proId;
        this.proName = proName;
        this.price = price;
    }

    public void display() {
        System.out.println("Product-Id : " + proId);
        System.out.println("Product-Name : " + proName);
        System.out.println("Product-Price : " + price);
    }
}

public class ProductMain{
    public static void main(String[] args){
        Product p1 = new Product(1, "Mobile", 20000.00);
        Product p2 = new Product(2, "Tv", 10000.00);
        Product p3 = new Product(3, "Ac", 30000.00);
        Product p4 = new Product(4, "Remote", 150.00);
        Product p5 = new Product(5, "Table", 1500.00);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}