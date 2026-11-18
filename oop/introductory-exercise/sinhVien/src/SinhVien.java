import java.util.Scanner;

public class SinhVien {
    // cac thuoc tinh.
    private String name;
    private String iD;
    private int birth_year;
    private double avg_point;


    // cac phuong thuc.
    public SinhVien(){

    }

    public SinhVien(String iD, String name, int birth_year, double avg_point) {
        this.name = name;
        this.iD = iD;
        this.birth_year = birth_year;
        this.avg_point = avg_point;
    }

    // getter va setter.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public double getAvg_point() {
        return this.avg_point;
    }

    public void setAvg_point(double avg_point) {
        this.avg_point = avg_point;
    }

    // ham sep loai sinh vien.
    public String ranking(){
        if(this.avg_point < 0 && this.avg_point > 10){
            return "Diem khong hop le!";
        }
        if(this.avg_point >= 8.5 && this.avg_point <= 10.0){
            return "Loai gioi";
        }
        if(this.avg_point >= 6.5 && this.avg_point < 8.5){
            return "Loai kha";
        }
        if(this.avg_point >= 5.0 && this.avg_point < 6.5){
            return "Loai trung binh";
        }
        return "Loai yeu";
    }

    // ham xuat.
    @Override
    public String toString() {
        return  "\nMa so sinh vien: "+this.iD+
                "\nHo va ten: "+this.name+
                "\nNam sinh: "+this.birth_year+
                "\nDiem trung binh: "+this.avg_point+
                "\nXep loai: "+this.ranking();
    }
}
