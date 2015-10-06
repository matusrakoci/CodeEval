import java.util.*;
import java.io.*;

class Main { 

	private static final Comparator<String> comparator = new Comparator<>() { 
	
		public int compare(String f, String t) { 
			return Integer.compare(f.length(), t.length());
		}

	};

	public static void main(String[] args) throws Throwable { 

		Scanner input = new Scanner(new File(args[0]));

		int count = input.nextInt();
		input.nextLine();

		List<String> list = new ArrayList<>();
		while(input.hasNext()) 
			list.add(input.nextLine());

		Collections.sort(list, Collections.reverseOrder(comparator));

		for(int i = 0; i < count; i++)
			System.out.println(list.get(i));

                input.close();
	}

}