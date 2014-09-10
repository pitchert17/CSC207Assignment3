package partD;

public class NameGame {
	public static void main(String[] args) {
		System.out.println(nameGame("Shirley"));
		return;
	}

	public static String nameGame(String nameInput) {
		String output = "";
		// Generate truncated name
		String truncatedName = nameInput.substring(firstVowel(nameInput));
		// Generate outputted string
		output = output + nameInput + "!\n"; // Shirley!
		// Second Line
		output = output + nameInput + ", " + nameInput + " bo B"
				+ truncatedName + " Bonana fanna fo F" + truncatedName + "\n";
		// Third Line
		output = output + "Fee fy mo M" + truncatedName + ", " + nameInput
				+ "!\n";
		return output;
	}

	public static int firstVowel(String name) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (name.charAt(i) == vowels[j]) {
					return i;
				}
			}
		}
		return 0;
	}
}
