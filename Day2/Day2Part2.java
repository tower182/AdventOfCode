import java.io.*;
import java.lang.*;

public class Day2Part2 {
	public static void main(String[] args) throws IOException {
		
		File file = new File(args[0]);
		int l = 0; int w = 0; int h = 0;
		int totalForAll = 0;
		int totalForLine = 0;
		// 

		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] split = line.split("x");
			l = Integer.parseInt(split[0]);
			w = Integer.parseInt(split[1]);
			h = Integer.parseInt(split[2]);
			
			int perim1 = (2*l) + (2*w);
			int perim2 = (2*w) + (2*h);
			int perim3 = (2*h) + (2*l);
			int lwh = l*w*h;

			int smallestp = Math.min(perim1,Math.min(perim2,perim3));
			
			totalForLine = smallestp + lwh;
			
			totalForAll = totalForAll + totalForLine;

		}
			System.out.println(totalForAll);
	}
}