package BAI_1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nhanvien> dsNhanvien = new ArrayList<Nhanvien>();

        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập loại nhân viên:");
            System.out.println("1. Nhân viên chính thức");
            System.out.println("2. Nhân viên thời vụ");
            int loaiNV = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng thừa

            if (loaiNV == 1) { // Nhân viên chính thức
                System.out.print("Nhập mã nhân viên: ");
                String maNV = sc.nextLine();
                System.out.print("Nhập họ tên: ");
                String hoTen = sc.nextLine();
                System.out.print("Nhập bậc lương: ");
                int bacLuong = sc.nextInt();
                sc.nextLine(); // Đọc bỏ dòng thừa

                dsNhanvien.add(new Chinhthuc(maNV,hoTen,bacLuong));
            } else if (loaiNV == 2) { // Nhân viên thời vụ
                System.out.print("Nhập mã nhân viên: ");
                String maNV = sc.nextLine();
                System.out.print("Nhập họ tên: ");
                String hoTen = sc.nextLine();
                System.out.print("Nhập số giờ làm việc: ");
                int soGioLamViec = sc.nextInt();
                sc.nextLine(); // Đọc bỏ dòng thừa

                dsNhanvien.add(new Thoivu(maNV,hoTen, soGioLamViec));
            } else {
                System.out.println("Loại nhân viên không hợp lệ.");
                i--; // Nếu nhập sai loại nhân viên, quay lại nhập lại
            }
        }

        System.out.println("\nDanh sách nhân viên và tiền lương:");
        for (Nhanvien nv : dsNhanvien) {
            try {
                double tienLuong = nv.Tinhtienluong();
                System.out.println("Mã NV: " + nv.getManhanvien() + ", Tên: " + nv.getHoten() + ", Lương: " + tienLuong);
            } catch (Exception e) {
                System.out.println("Lỗi tính lương: " + e.getMessage());
            }
        }
    }
}