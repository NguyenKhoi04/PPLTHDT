package BAI_1;

public abstract class Chinhthuc extends Nhanvien {
	
	public Chinhthuc(String Manhanvien, String Hoten, int Bacluong) {
		super(Manhanvien, Hoten);
		Chinhthuc.Bacluong = Bacluong;
	}

	public int getBacluong() {
		return Bacluong;
	}

	public void setBacluong(int bacluong) {
		Bacluong = bacluong;
	}
   public double Tinhtienluong() {
	   //double this.Bacluong;
	  return Bacluong = Chinhthuc.Bacluong*2000000; 
   }
}
