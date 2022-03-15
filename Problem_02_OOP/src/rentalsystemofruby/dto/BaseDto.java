package rentalsystemofruby.dto;

public class BaseDto {
	private Long id;
	
	private Long seriNumber;
	
	private String name;
	
	private float price;
	
	private String  category;
	
	private String shortDescription;
	
	private Long  quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSeriNumber() {
		return seriNumber;
	}

	public void setSeriNumber(Long seriNumber) {
		this.seriNumber = seriNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	
}