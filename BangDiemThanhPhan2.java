package OOP_2023;
import java.util.*;

public class BangDiemThanhPhan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien4> list = new ArrayList<>();
        for (int i = 0; i < n; ++i){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            SinhVien4 x = new SinhVien4(ma, ten, lop, d1, d2, d3);
            list.add(x);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); ++i){
            System.out.println(i + 1 + " " + list.get(i));
        }
    }
}

class SinhVien4 implements Comparable <SinhVien4>{
    private String ma, ten, lop;
    private double d1, d2, d3;

    public SinhVien4(String ma, String ten, String lop, double d1, double d2, double d3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + String.format("%.1f %.1f %.1f", d1, d2, d3);
    }

    @Override
    public int compareTo(SinhVien4 o) {
        return this.ten.compareTo(o.ten);
    }
}