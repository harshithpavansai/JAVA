class productDetails {
    int id;
    String name;
    String type;
    double price;
    int discountPercentage;

    productDetails(int i, String n, String t, double p, int dp) {
        id = i;
        name = n;
        type = t;
        price = p;
        discountPercentage = dp;
    }

    void printDetails() {
        System.out.println("id of the product is : " + id);
        System.out.println("name of the product: " + name);
        System.out.println("product type: " + type);
        System.out.println("the price of item is: " + price);
        System.out.println("discount on the item is: " + discountPercentage);
    }

    void getDiscountAmount() {
        double result = price - price * (discountPercentage / 100.0);
        System.out.println("the price after applying discount is: " + result);
    }

}

public class ProductExample1 {
    public static void main(String[] args) {
        productDetails p1 = new productDetails(100110, "One Plus 13R", "Electronic Gadget", 42000.00, 25);
        p1.printDetails();
        p1.getDiscountAmount();
    }

}
