import java.io.*;

public class AdventOne {

	public static void main(String[] args) throws IOException {
		String filename = "input.txt";
		int total = 0;
		int c; 

		FileInputStream fis = new FileInputStream(filename);		
		while ((c = fis.read()) != -1 ) {
			char current = (char) c;
			if (current == '(') {total++;} else {total--;}
		}

		System.out.println("total = " + total);

	}


}


