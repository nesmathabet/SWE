
public class ProductEntity {
	public ProductEntity(String name, String category, String price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	private String category;
	private String price;
}
