package IMSPack.IMSApp.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	private long id;
	private String fName, lName, email, password;
	private String address;
	private int pincode;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(long id, String fName, String lName, String email, String password, String address, int pincode) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password="
				+ password + ", address=" + address + ", pincode=" + pincode + "]";
	}
	
	
	

}
