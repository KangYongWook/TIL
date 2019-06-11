package ws;

public class User {
	int id;
	String name;
	String pwd;
	
	public User() {}
	
	public User(int id, String name, String pwd) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", pwd=" + pwd + "]";
	}
}
