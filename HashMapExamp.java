import java.util.HashMap;
import java.util.Map;

public class HashMapExamp {

	public static void main(String[] args) {
		Map<Integer, EmpDetails> map = new HashMap<Integer, EmpDetails>();
		
		EmpDetails ep = new EmpDetails(450, "kunal", 814778592);
		EmpDetails ep1 = new EmpDetails(451, "Dhokewaz Goldi", 814778332);
		EmpDetails ep2 = new EmpDetails(452, "Masum Kanchan Bhabhi", 814774492);
		map.put(1, ep);
		map.put(2, ep1);
		map.put(3, ep2);
		
		for(Map.Entry<Integer, EmpDetails> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        EmpDetails b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b);   
	    }    
	}
}
