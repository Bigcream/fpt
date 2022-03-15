package rentalsystemofruby.dto;

import java.util.Scanner;

public class Furniture extends Thing {
	
	private String color;
	

	public Furniture() {
		super();
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append(super.getDescription());
		description.append("Color: " + color + "\n");
		return description.toString();
	}
	
	@Override
	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		super.inputInfo();
        System.out.println("Enter color : ");
        color = input.nextLine();
	}


}
