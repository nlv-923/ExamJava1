package bai2;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KyThuat k1 = new KyThuat("NV01", "Ngoc Lan", "23/09/2000", "Hanoi", "IT");
        System.out.printf(k1.toString());
        KyThuat k2 = new KyThuat("NV02");
        System.out.println("\nNhap ho ten: ");
        k2.setHoTen(in.nextLine());
        System.out.println("Nhap nam sinh: ");
        k2.setNamSinh(in.nextLine());
        System.out.println("Nhap dia chi: ");
        k2.setDiaChi(in.nextLine());
        System.out.println("Nhap chuyen nganh: ");
        k2.setChuyenNganh(in.nextLine());
        in.close();
        System.out.println(k2.toString());
    }
}
