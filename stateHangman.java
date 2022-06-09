import java.util.Scanner;

public class stateHangman{
	private static String[] states = {"alabama", "arkansas", "alaska", "arizona", "california", "colorodo", "connecticut", "delaware", "florida", "georgia","hawaii","idaho", "illinois", "indiana", "iowa", "kansas", "kentucky", "louisiana", "maine", "maryland", "massachusetts", "michigan", "minnesota", "mississippi", "missouri","montana", "nebraska", "nevada", "new hampshire", "new jersey", "new mexico", "new york", "north carolina", "north dakota", "ohio", "oklahoma", "oregon", "pennsylvania", "rhode island", "south carolina", "south dakota", "tennessee", "texas", "utah", "vermont", "virginia", "washington", "west virginia", "wisconsin", "wyoming" };
	private static String word = states[(int) (Math.random() * states.length)];
	private static String unknown = new String(new char[word.length()]).replace("\0", "?");
	private static int count = 0;
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(count < 7 && unknown.contains("?")){
			System.out.println("Guess any letter in the word");
			System.out.println(unknown);
			String guess = sc.nextLine();
			hang(guess);
		}
		sc.close();

	}
	public static void hang(String guess){
		String newunknown = "";
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == guess.charAt(0)){
				newunknown += guess.charAt(0);
			} 
			else if(unknown.charAt(i) != '?'){
				newunknown += word.charAt(i);
			} 
			else{
				newunknown += "?";
			}
		}

		if(unknown.equals(newunknown)){
			count++;
			hangmanImage();
		} 
		else{
			unknown = newunknown;
		}
		if(unknown.equals(word)){
			System.out.println("Correct! The state was " + word);
		}
	}

	public static void hangmanImage(){
		if(count == 1){
			System.out.println("Nope, guess again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
		}
		if(count == 2){
			System.out.println("Nope, guess again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("Nope, guess again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if(count == 4){
			System.out.println("Nope, guess again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if(count == 5){
			System.out.println("Nope, guess again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if(count == 6){
			System.out.println("Nope, guess again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if(count == 7){
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The state was " + word);
		}
	}
}
	
	
	