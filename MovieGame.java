import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MovieGame {
	
	private Random random = new Random();
	
	public static void main (String args []) throws FileNotFoundException {
		 
		File file = new File("C:\\Users\\anvut\\eclipse-workspace\\Guess The Movie\\bin\\Movies.txt");
		
		int count=0;
		
			
			Scanner scanner = new Scanner(file);
			
			List<String> list = new ArrayList<String>();
			
			while (scanner.hasNextLine()) {
				
				String line = scanner.nextLine();
				list.add(line);
		   //   int intLine = Integer.parseInt(line);			  
		   //   Random random = new Random();
		   //   String word = random.nextLine(line); 
		   //   System.out.println(line);
				count++;
		   //   System.out.println(count);
		   
			
				//System.out.println(line);
		
			}
			
		/*} catch (FileNotFoundException e) {
			
			System.out.println("error");
			
		}*/
		
		MovieGame mo = new MovieGame();
		
		
			
			System.out.println(mo.getRandomList(list));
		
	   
	}
	
	public String getRandomList(List<String> list) {
		
		int index = random.nextInt(list.size());
		
		return list.get(index);
		
	}
	
	/*public static void main(String arg[]) throws Exception {
		
		File file = new File("C:\\Users\\anvut\\eclipse-workspace\\Guess The Movie\\bin\\Movies.txt");
		
		Scanner fileScanner = new Scanner(file);
		String result = null;
		Random rand = new Random();
		int n = 0;
		
		while (fileScanner.hasNextLine()) {
			n++;
			
			String line = fileScanner.nextLine();
			
			if (line.rand.nextInt(n);
				
				result = line;
			
			System.out.println(rand.nextInt(n));
				
		}
		
	}
	
	/*public static void main(String[] args) throws FileNotFoundException {
	     Map<String,Integer> map = new HashMap<String,Integer>();
	     for(int i = 0; i < 1000; ++i)
	     {
	        String s = choose(new File("C:\\Users\\anvut\\eclipse-workspace\\Guess The Movie\\bin\\Movies.txt"));
	        if(!map.containsKey(s))
	           map.put(s, 0);
	        map.put(s, map.get(s) + 1);
	     }

	     System.out.println(map);
	  }

	  public static String choose(File f) throws FileNotFoundException
	  {
	     String result = null;
	     Random rand = new Random();
	     int n = 0;
	     for(Scanner sc = new Scanner(f); sc.hasNext(); )
	     {
	        ++n;
	        String line = sc.nextLine();
	        if(rand.nextInt(n) == 0)
	           result = line;         
	     }

	     return result;      
	  }*/

}
