package day34_inheritance;

public class Encapsulation {

	private String okulIsmi="Yildiz Koleji";
	private int okulHesapNo=12345;
	private boolean okulAcikMi=true;
	
	
	public String getOkulIsmi() {
		return okulIsmi;
	}
	
	public int getOkulHesapNo() {
		return okulHesapNo;
	}
	public boolean isOkulAcikMi() {
		return okulAcikMi;
	}


	
	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi=okulIsmi;
	}
	
	public void setOkulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
	}
	public void setOkulAcikMi(boolean okulAcikMi) {
		this.okulAcikMi=okulAcikMi;
	}


}
