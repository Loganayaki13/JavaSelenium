package expectionsErrorHandle;

import java.util.Scanner;
import java.util.TreeMap;

public class Q6 {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Employee Names : ");

		// put emp id ,name
		
		map.put(2, "loga");
		map.put(5, "raju");
		map.put(1, "anand");
		map.put(3, "mohan");
		map.put(4, "priya");
		map.put(6, "shny");
		
		System.out.println(map);
		
        //print the emp names
		
		System.out.println("Emp Names : ");
		System.out.println(map.values());

	}

}
