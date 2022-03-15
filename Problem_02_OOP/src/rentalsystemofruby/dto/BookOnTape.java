package rentalsystemofruby.dto;

import java.util.Scanner;

public class BookOnTape extends Thing {
	
	private String authorName;
	
	public BookOnTape() {
		super();
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String getDescription() {
		StringBuilder description = new StringBuilder();
		description.append(super.getDescription());
		description.append("Author name: " + authorName + "\n");
		return description.toString();
	}
	
	@Override
	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		super.inputInfo();
        System.out.println("Enter author name : ");
        authorName = input.nextLine();
	}

}
