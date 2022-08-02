package pe.com.appfinalbootcamp.model;

public class AFPAccount {
	private int iDNI;
	private double dAccountAmount;
	private String sAFP;
	
	public int getiDNI() {
		return iDNI;
	}
	public void setiDNI(int iDNI) {
		this.iDNI = iDNI;
	}
	public double getdAccountAmount() {
		return dAccountAmount;
	}
	public void setdAccountAmount(double dAccountAmount) {
		this.dAccountAmount = dAccountAmount;
	}
	public String getsAFP() {
		return sAFP;
	}
	public void setsAFP(String sAFP) {
		this.sAFP = sAFP;
	}
}
