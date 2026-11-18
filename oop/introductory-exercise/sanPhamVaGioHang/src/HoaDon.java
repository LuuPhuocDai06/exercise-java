public class HoaDon {
    private SanPham sp;
    private int quantity;

    public HoaDon(){

    }
    public HoaDon(SanPham sp, int quantity){
        this.sp = sp;
        this.quantity = quantity;
    }

    // getter va setter.
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // ham thanh tien.
    public void payment(){
        if(this.quantity > sp.getUnitsInStock()){
            System.out.println("So luong ton kho khong du de dap ung! vui long chon giam so luong mua!");
        }
        else {
            this.sp.setUnitsInStock(this.sp.getUnitsInStock() - this.quantity);
            System.out.println("Thanh toan thanh cong: "+this.sp.getUnitPrice() * this.quantity+"VND/"+this.quantity+" san pham.");
        }
    }


    // toString.
    @Override
    public String toString() {
        return "\n == Bill =="+
                "\nTen san pham: "+this.sp.getProductName()+
                "\nGia san pham: "+this.sp.getUnitPrice()+
                "\nSo luong mua: "+this.getQuantity()+
                "\nTong tien: "+this.sp.getUnitPrice() * this.quantity+"VND"+
                "\n==========";
    }
}
