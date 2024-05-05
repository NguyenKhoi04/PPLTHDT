package BAI_1;

public class Thoivu extends Nhanvien {

	public Thoivu(String Manhanvien, String Hoten, int Thoihanhopdong) {
		super(Manhanvien, Hoten);
		Thoivu.Bacluong = Bacluong;
		
	}
	public int getThoihanhopdong() {
		return Thoihanhopdong;
	}
	public void setThoihanhopdong(int thoihanhopdong) {
		Thoihanhopdong = thoihanhopdong;
	}
	    
	public double Tinhtienluong() {
		//double Bacluong;
		if (Thoivu.Thoihanhopdong>=90) {
			return Bacluong = 2000000 *2+ 1000000;
		}
		return Thoivu.Bacluong;
	}
}
