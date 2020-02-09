package co.edureka;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Sunil",25000f)); //null
		System.out.println(bank.put("Sunil",11500.5f)); //25000.0 
		System.out.println(bank.put("Anil",45000f));
		bank.put("Rohan",34500f);
		bank.put("Rahul",12500f);
		
		System.out.println(bank);
		/*--- how to get the value of a key */
		//System.out.println(bank.containsKey("Sunill"));
		Float bal = bank.get("Sunil");
		System.out.println("A/C Balance of Sunil = "+ bal);
		
		/*iterate the keys*/
		System.out.print("A/C Holders = ");
		Set<String> keys = bank.keySet();
		for(String key : keys) {
			System.out.print(key+" | ");
		}
		System.out.println();
		
		/*iterate on the entries*/
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Float> entry = it.next();
			String key = entry.getKey();
			Float val = entry.getValue();
			System.out.println(key+" : "+val);
			Thread.sleep(1000);
		}
	}
}
