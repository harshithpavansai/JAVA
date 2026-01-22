class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product (" + name + "," + price + ")";
    }
}

public class productExample {
    public static void main(String[] args) {
        Product pro1 = new Product("laptop", 56000);
        Product pro2 = new Product("chair", 2000);
        System.out.println(pro1);
        System.out.println(pro2);
    }

}
