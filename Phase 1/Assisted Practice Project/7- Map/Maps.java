package text12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> contacts = new HashMap<>();
		contacts.put("Anil", 50);
		contacts.put("Brijesh", 60);
		contacts.put("Raghav", 70);
		contacts.put("Manjeet", 80);
		System.out.println(contacts);
		
		Set<String> keys = contacts.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " " + contacts.get(key));
		}
		
		Hashtable<String,Integer> contacts1 = new Hashtable<>();
		contacts1.put("Anil", 50);
		contacts1.put("Brijesh", 60);
		contacts1.put("Raghav", 70);
		contacts1.put("Manjeet", 80);
		System.out.println(contacts1);
		
		TreeMap<String,Integer> contacts2 = new TreeMap<>();
		contacts2.put("Anil", 50);
		contacts2.put("Brijesh", 60);
		contacts2.put("Raghav", 70);
		contacts2.put("Manjeet", 80);
		System.out.println(contacts2);
		
		

		

	}

}
