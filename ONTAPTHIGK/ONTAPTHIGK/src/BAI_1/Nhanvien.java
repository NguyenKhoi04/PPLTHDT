package BAI_1;

public abstract class Nhanvien {
  protected static String Manhanvien;
  protected static String Hoten;
  protected static int Bacluong;
  protected static int Thoihanhopdong;
  //private Nhanvien() {}
//Constructor using Fields
public Nhanvien(String Manhanvien, String Hoten) 
{
	Nhanvien.Manhanvien = Manhanvien;//Manhanvien thêm this
	Nhanvien.Hoten = Hoten;//Hoten
}  
//Getters and Setters
public String getManhanvien() {
	return Manhanvien;
}
public void setManhanvien(String Manhanvien) {
	Nhanvien.Manhanvien = Manhanvien;
}
public String getHoten() {
	return Hoten;
}
public void setHoten(String Hoten) {
	Nhanvien.Hoten = Hoten;
}
//ctrl + tab
public abstract double Tinhtienluong();//Phương thức tính tiền lương (abstract class không thể khởi tạo đối tượng.)

public void XemThongTin() {

System.out.println("Mã NV: "+ Nhanvien.Manhanvien + "Tên: " +Nhanvien.Hoten +"Lương: "+ Tinhtienluong());	
}

}//class Nhanvien

