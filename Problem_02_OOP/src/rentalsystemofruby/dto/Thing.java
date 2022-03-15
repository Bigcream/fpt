package rentalsystemofruby.dto;

import java.util.Scanner;

public abstract class Thing {
	private Long id;
	
	private Long seriNumber;
	
	private String name;
	
	private float price;
	
	private String  category;
	
	private String shortDescription;
	
	private Long  quantity;
	
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append("Name: " + name + "\n");
		description.append("Seri Number: " + seriNumber + "\n");
		description.append("Price: " + price + "\n");
		description.append("Category: " + category + "\n");
		description.append("Short Description: " + shortDescription + "\n");
		description.append("Quantity: " + quantity + "\n");
		return description.toString();
	}
	
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = input.nextLine();
        
        System.out.println("Enter seri number : ");
        seriNumber = input.nextLong();
             
        System.out.println("Enter category : ");
        category = input.nextLine();
        
        System.out.println("Enter price : ");
        price = input.nextFloat();
        input.nextLine();
        
        System.out.println("Enter short description : ");
        shortDescription = input.nextLine();
        
        System.out.println("Enter quantity : ");
        quantity = input.nextLong();
    }
	
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
