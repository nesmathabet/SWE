
public class ProductOfStoreownerEntity {
	private String category;
	private String price;
	private String name;
	private String brandname;
	private String brandcategory;
	public ProductOfStoreownerEntity(String name, String category, String price,String brandname,String brandcategory ) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.brandname = brandname;
		this.brandcategory = brandcategory;
	}
	
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
	public String getBrandName() {
		return brandname;
	}
	public void setBrandName(String brandname) {
		this.brandname = brandname;
	}
	public String getBrandCategory() {
		return brandcategory;
	}
	public void setBrandCategory(String brandcategory) {
		this.brandcategory = brandcategory;
	}
	
}

