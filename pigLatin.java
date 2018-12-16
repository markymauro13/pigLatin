import java.util.Scanner;

public class pigLatin {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Type in a word: ");
		String input = s.nextLine();
		String changeInput = input.substring(1) + "ay";
		System.out.println(changeInput);
		
	}
	
}
