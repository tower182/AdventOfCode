import java.io.*;
import java.lang.*;

public class Day2 {
	public static void main(String[] args) throws IOException {
		String filename = "input.txt";
		int l = 0; int w = 0; int h = 0; int minNum = 0; 
		int totalForAll = 0;
		int totalForLine = 0;
		// 

		FileInputStream fis = new FileInputStream(filename);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] split = line.split("x");
			l = Integer.parseInt(split[0]);
			w = Integer.parseInt(split[1]);
			h = Integer.parseInt(split[2]);

			int lw = l * w;
			int wh = w * h;
			int hl = h * l;
			
			minNum = Math.min(lw,Math.min(wh,hl));

			totalForLine = ((2*lw) + (2*wh) + (2*hl)) + minNum;
			//System.out.println("Total for line is: \n" + totalForLine);
			
			totalForAll = totalForAll + totalForLine;
		}
			System.out.println(totalForAll);
	}
}

