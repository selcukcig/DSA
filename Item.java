/**
 * A class of items for sale.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 */
public class Item {
    private String description;
    private int price; // Fiyatlar kuruş (cent) cinsinden tutulur (örneğin 2995 = $29.95)

    public Item(String productDescription, int productPrice) {
        description = productDescription;
        price = productPrice;
    } // end constructor

    public String getDescription() {
        return description;
    } // end getDescription

    public int getPrice() {
        return price;
    } // end getPrice

    public String toString() {
        return description + "\t$" + price / 100 + "." + price % 100;
    } // end toString
} // end Item
