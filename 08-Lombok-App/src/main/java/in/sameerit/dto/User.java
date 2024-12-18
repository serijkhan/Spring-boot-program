package in.sameerit.dto;

public class User {
	
	private Integer userid;
	private String username;
	private String email;
	private String pwd;
	private String gender;
	private Long phno;
	
	public User() {

	
	}
	
	public User(Integer userid, String username, String email, String pwd, String gender, Long phno) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
		this.phno = phno;
	}

	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", pwd=" + pwd + ", gender="
				+ gender + ", phno=" + phno + "]";
	}
	
	
	

}
