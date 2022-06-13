package mapconcept;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class Map {
	Scanner scan = new Scanner(System.in);

	void hashMap() {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		System.out.println("HasMap......\n");
		System.out.println("Enter the size ");
		int number = 0;

		try {
			number = scan.nextInt();
		} catch (InputMismatchException e) {

			System.err.println("Enter integer value");
		}
		for (int index = 0; index < number; index++) {
			System.out.println("Enter the Maplist");
			hmap.put(scan.nextInt(), scan.nextInt());
			
		}

		System.out.println(hmap );
		
		System.out.println();
		System.out.println("Enter the key value");
		System.out.println("Contains key : " + hmap.containsKey(scan.nextInt()));
		System.out.println(hmap);

		System.out.println("Enter the  value");
		System.out.println("Contains value : " + hmap.containsValue(scan.nextInt()));
		System.out.println(hmap);
		System.out.println();
		

	}

	void linkedHash() {

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(1, "vidhya");
		lmap.put(2, "Anu");
		lmap.put(3, "Reema");
		lmap.put(4, "Jublie");
		lmap.put(4, "Anu");

		System.out.println("LinkedHash.....\n");
		System.out.println(lmap);

		System.out.println("Size : " + lmap.size());
		System.out.println("Key : " + lmap.keySet());
		System.out.println("Value : " + lmap.values());
		System.out.println("Entry Set : " + lmap.entrySet());
		System.out.println(lmap.containsKey(2));
		System.out.println(lmap.containsValue("Anu"));
		System.out.println();

	}

	void treeMap() {

		TreeMap<Integer, String> tmap = new TreeMap<>(Collections.reverseOrder());

		tmap.put(1, "600");
		tmap.put(2, "300");
		tmap.put(3, "400");
		tmap.put(4, "500");
		tmap.put(5, "700");

		System.out.println("TreeMaps......");
		System.out.println(tmap);

		System.out.println("Iterating Hashmap...");
		for (Entry<Integer, String> entry : tmap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
	}
}
