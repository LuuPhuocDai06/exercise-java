public class SanPham {
    // cac thuoc tinh.
    private String productName;
    private double unitPrice;
    private int unitsInStock; // so luong ton kho.

    // constructor.
    public SanPham(){

    }
    public SanPham(String productName, double unitPrice, int unitsInStock) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
    }

    // getter va setter.
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
