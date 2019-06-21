package cg;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map<String, Double> m=new HashMap<String, Double>();
		Map<String, Double> m=new TreeMap<String, Double>();
		m.put("Ram", 5000.00);
		m.put("Sham", 7000.00);
		m.put("Abdul", 9000.00);
		m.put("Ganesh", 4000.00);
		// m.put(null, 0.00);
		System.out.println(m);
		System.out.println(m.size());
		Set<String> keysSet=m.keySet();
		System.out.println(keysSet);
		
		for(String k:keysSet) {
			Double val=m.get(k);
			System.out.println(k+" has balance of Rs. "+val);
		}
		Double bal=m.get("Sham")-3000;
		m.put("Sham", bal);
		System.out.println("---------------------------------");
		for(String k:keysSet) {
			Double val=m.get(k);
			System.out.println(k+" has balance of Rs. "+val);
		}
		
		Collection<Double> vals=m.values();
		
		List<Double> vallist=new ArrayList<Double> (vals);
		Collections.sort(vallist);
		for(double d: vallist) {
			System.out.println(d);
		}

		/*m.remove("Ganesh");
		System.out.println(m);
		System.out.println(m.size());
		*/

	}

}
