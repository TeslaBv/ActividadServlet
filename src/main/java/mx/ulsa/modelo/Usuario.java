package mx.ulsa.modelo;

public class Usuario {
	private String name;
	private String username;
	private String email;
	private String password;
	
	
	public Usuario() {}
	
	
	public Usuario(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isValido() {
		return "admin".equals(username) && "1234".equals(password);
	}
	
	public boolean isValidoEmail() {
		return "admin@gmail.com".equals(email) && "1234".equals(password);
	}
	public boolean isRegistered() {
		return true;
	}
	
}
