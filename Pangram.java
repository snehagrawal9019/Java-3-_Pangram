package pangram;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } 
        else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
         
        s = s.replaceAll(" ", "").toLowerCase();
        boolean[] letterPresent = new boolean[26];
        for (char c : s.toCharArray()) {
            if ('a' <= c && c <= 'z') {
               letterPresent[c - 'a'] = true;
            }
        }
        for (boolean isPresent : letterPresent) {
            if (!isPresent) {
                return false;
            }
        }
        return true;
	}
}
