import java.util.List;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MovieGame {
	
	private Random random = new Random();
	
	public static void main (String args []) throws IOException {
		 
		File file = new File("C:\\Users\\anvut\\eclipse-workspace\\Guess The Movie\\bin\\Movies.txt");
		
		int count=0;
		
		Scanner scanner = new Scanner(file);
			
		List<String> list = new ArrayList<String>();
			
			while (scanner.hasNextLine()) {
				
				String line = scanner.nextLine();
				list.add(line);
		   
				
		  
			}
		
		MovieGame mo = new MovieGame();
		
		String s1 = mo.getRandomList(list);
		
		String[] s = new String[s1.length()];
		
		System.out.println("Welcome to the Guess The Movie game");
		System.out.println("Simple rule: Guess each characters in the movie title");
		
		System.out.printf("You are guessing: ");
		
			for (int i = 0; i < s.length; i++) {
			
				s[i] = "_";
			
				System.out.printf("%s ", s[i]);
			}
	
		
		/*BufferedInputStream br=new BufferedInputStream(System.in);
		
		char a= (char)br.read();*/
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int posOfJ = 0;
		
				while (true) {
					
					System.out.println("Guess the letter: ");
					
					posOfJ = s1.indexOf(sc.next().charAt(0));
					
					System.out.println(posOfJ);
					
					count++;
					
					if (count == s1.length()) {
						
						break;
					}
				}
				
				
				
				//System.out.println(sc.next().charAt(0));
				
		/*s[posOfJ] = sc.next();
		
		System.out.println(s[posOfJ]);*/
		
		//System.out.println(c[posOfJ]);
				
	}
	
	public String getRandomList(List<String> list) {
		
		int index = random.nextInt(list.size());
		
		return list.get(index);
		
	}
	
}
