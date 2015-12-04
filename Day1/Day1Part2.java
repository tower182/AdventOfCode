import java.io.*;

public class Day1Part2 {

	public static void main(String[] args) throws IOException {
		String filename = "input.txt";
		int total = 0;
		int position = 0;
		int c; 

		FileInputStream fis = new FileInputStream(filename);
		while ((c = fis.read()) != -1 ) {
			char current = (char) c;
			if (current == '(') {
				total++;
				position++;
			} else if (current == ')') {
				total--;
				position++;
				if (total == -1) {
					break;
				}
			}
		}
	
		System.out.println("total = \n" + total);
		System.out.println("Position = \n" + position);
	}
}