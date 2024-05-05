package BAI_1;

public class BangCap extends Nhanvien  {
  private String LoaiBangcap;
  private String Chuyennganh;
  private int Bacluong;

public BangCap(String Manhanvien, String Hoten, String loaiBangcap, String chuyennganh, int bacluong) {
	super(Manhanvien, Hoten);
	LoaiBangcap = loaiBangcap;
	Chuyennganh = chuyennganh;
	Bacluong = bacluong;
}

public String getLoaiBangcap() {
	return LoaiBangcap;
}

public void setLoaiBangcap(String loaiBangcap) {
	LoaiBangcap = loaiBangcap;
}

public String getChuyennganh() {
	return Chuyennganh;
}

public void setChuyennganh(String chuyennganh) {
	Chuyennganh = chuyennganh;
}

@Override
public double Tinhtienluong() {
	// TODO Auto-generated method stub
	return 0;
}

public int getBacluong() {
	return Bacluong;
}

public void setBacluong(int bacluong) {
	Bacluong = bacluong;
}
public void Tangtienluong() {
	if (LoaiBangcap.equals("Đại học")) {
        Bacluong += Bacluong * 0.1; // Tăng lương 10%
    } else if (LoaiBangcap.equals("Thạc sĩ")) {
        Bacluong += Bacluong * 0.15; // Tăng lương 15%
    }
}
}
