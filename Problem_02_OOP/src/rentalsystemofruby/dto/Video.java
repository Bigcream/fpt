package rentalsystemofruby.dto;

import java.util.Scanner;

public class Video extends Thing {
	
	private String country;
	
	
	public Video() {
		super();
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append(super.getDescription());
		description.append("Country: " + country + "\n");
		return description.toString();
	}
	
	@Override
	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		super.inputInfo();
        System.out.println("Enter country : ");
        country = input.nextLine();
	}

}
