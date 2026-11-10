public class Main {
    // hàm main.
    public static void main(String[] args){
        double ratio = 85.67;
        System.out.printf("Hoàn thành: %.2f%%%n", ratio);

        try { System.out.printf("%d%n", 29.9); }
        catch (Exception e) { System.out.println(e.getClass().getSimpleName()); }
// IllegalFormatConversionException

        try { System.out.printf("%s %s%n", "hello"); }
        catch (Exception e) { System.out.println(e.getClass().getSimpleName()); }
// MissingFormatArgumentException

        try { System.out.println(String.format("Giảm 50%")); }
        catch (Exception e) { System.out.println(e.getClass().getSimpleName()); }
// UnknownFormatConversionException
    }
}