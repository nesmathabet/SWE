
public class StoreEntity {
	public StoreEntity(String name, String type , String location) {
		this.location = location;
		this.type = type;
		this.name = name;
	}
	private String location;
	private String type;
	private String name;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
