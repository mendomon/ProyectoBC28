package pe.com.appfinalbootcamp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotNull;
//import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Document(collection = "AFPClient")
public class AFPClient implements Serializable{

	@Id
	@NotNull
	private String sDNI;
	private String sFirstName;
	private String sLastName;	
	private String sPhoneNumber;
	private String sEmail;
	private String sAFP;
	
	/*public String getsFirstName() {
		return sFirstName;
	}
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}
	public String getsLastName() {
		return sLastName;
	}
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
	public int getiDNI() {
		return iDNI;
	}
	public void setiDNI(int iDNI) {
		this.iDNI = iDNI;
	}
	public int getiPhoneNumber() {
		return iPhoneNumber;
	}
	public void setiPhoneNumber(int iPhoneNumber) {
		this.iPhoneNumber = iPhoneNumber;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsAFP() {
		return sAFP;
	}
	public void setsAFP(String sAFP) {
		this.sAFP = sAFP;
	}*/
}
