package pe.com.proyectointegrador.model;

public class User {
	
	int id;
	int code;
	String password;
	String firstname;
	String lastname;
	String img;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public String toString() {
		return "User [id=" + id + ", code=" + code + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + ", img=" + img + "]";
	}

	
}
