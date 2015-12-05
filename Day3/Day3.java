import java.io.*;
import java.util.*;
import java.awt.*;


public class Day3 {
	public static void main(String[] args) throws IOException {
		int c; 
		File file = new File(args[0]);
		Boolean santa = true;

		HashSet<String> visited = new HashSet<>();
		Point santa_location = new Point(0, 0);
		Point robot_location = new Point(0, 0);

		visited.add(santa_location.toString());

		FileInputStream fis = new FileInputStream(file);
		while((c = fis.read()) != -1) {
			char current = (char) c;			

			if (current == '^') {
				if (santa) santa_location.y++;
				else robot_location.y++;
			} else if (current == 'v') {
				if (santa) santa_location.y--;
				else robot_location.y--;
			} else if (current == '>') {
				if (santa) santa_location.x++;
				else robot_location.x++;
			} else
				if (santa) santa_location.x--;
				else robot_location.x--;
			
			if (santa) visited.add(santa_location.toString());
			else visited.add(robot_location.toString());

			santa = !santa;

		}
		System.out.println("");
		System.out.println(visited.size());
	}	


}

