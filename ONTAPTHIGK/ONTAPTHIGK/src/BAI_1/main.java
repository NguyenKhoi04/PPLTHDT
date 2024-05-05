package BAI_1;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class main extends Nhanvien {

	public main(String Manhanvien, String Hoten) {
		super(Manhanvien, Hoten);
	}
	public void Chinhthuc(String Manhanvien, String Hoten, int Bacluong) {
		Chinhthuc.Bacluong = Bacluong;
	}
	public void Thoivu(String Manhanvien, String Hoten, int Thoihanhopdong,int Bacluong) {
		Thoivu.Bacluong = Bacluong;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Nhanvien> dsNhanvien = new ArrayList<Nhanvien>();
		{
		System.out.print("Nhập số lượng nhân viên: ");
		int n =sc.nextInt();
		  for (int i = 0; i < n; i++) {
		System.out.println("Nhập loại nhân viên:");
		int loaiNV = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa
        if (loaiNV == 1) {// 1 là chinh thuc
        	System.out.print("Nhập bậc lương: ");
            int Bacluong = sc.nextInt();
            dsNhanvien.add(new Chinhthuc (Manhanvien,Hoten,Thoivu.Bacluong, Bacluong));
        }
        else if (loaiNV == 2) {// 2 la thoi vu
        	System.out.print("Nhập bậc lương: ");
            int Bacluong = sc.nextInt();
            dsNhanvien.add(new Thoivu (Manhanvien,Hoten,Thoivu.Bacluong, Bacluong) );
        }
        else {
            System.out.println("Loại nhân viên không hợp lệ.");
            i--; // Nếu nhập sai loại nhân viên, quay lại nhập lại
        }
        System.out.println("\nDanh sách nhân viên và tiền lương:");
        for (Nhanvien nv : dsNhanvien) {
            try {
                nv.Tinhtienluong();
            } catch (Exception e) {
                System.out.println("Lỗi tính lương: " + e.getMessage());
            }
        }
		  }
	}
}
