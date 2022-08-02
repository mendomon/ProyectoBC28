package pe.com.appfinalbootcamp.model;

public class AFPWithdrawalRequest {
	
	private int iDNI;
	private double dWithdrawalAmount;
	private String sAFP;
	
	public int getiDNI() {
		return iDNI;
	}
	public void setiDNI(int iDNI) {
		this.iDNI = iDNI;
	}
	public double getdWithdrawalAmount() {
		return dWithdrawalAmount;
	}
	public void setdWithdrawalAmount(double dWithdrawalAmount) {
		this.dWithdrawalAmount = dWithdrawalAmount;
	}
	public String getsAFP() {
		return sAFP;
	}
	public void setsAFP(String sAFP) {
		this.sAFP = sAFP;
	}
}
