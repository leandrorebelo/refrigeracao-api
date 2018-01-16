package br.com.refrigeracao.entity;

public class User {

	private Integer id;
	private String user;
	private String password;
	private Mechanical mechanical;
	
	public User(String user, String password, Mechanical mechanical) {
		this.user = user;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Mechanical getMechanical() {
		return mechanical;
	}

	public void setMechanical(Mechanical mechanical) {
		this.mechanical = mechanical;
	}
}