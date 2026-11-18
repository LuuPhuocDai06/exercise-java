public class Product {
    // các field.
    private String name;
    private double price;
    private int quantity;

    // Constructor.
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0 ) {
            throw new IllegalArgumentException("Price phải lớn hơn 0");
        }
        else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            throw new IllegalArgumentException("Quantity phải lớn 0");
        }
        else {
            this.quantity = quantity;
        }
    }

    // method getTotalValue.
    public void getTotalValue(){
        System.out.printf("Total: %.2f \n\n", (quantity * price));
    }
}
