
public class User {
	private String name;
	private String level;
	
	public User(String name, String level) {
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "name=" + name + ", level=" + level;
	}

	
	
}
