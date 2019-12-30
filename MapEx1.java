package emp;
import java.util.*;

public class MapEx1 {
	public static void main(String[]args) {
		// Map<Integer,Employee>map=new HashMap<>();
		// Map<Integer,Employee>map=new LinkedHashMap<>();
		Map<Integer,Employee>map=new TreeMap<>(new EmployeeKeyComparator());
		Employee e1=new Employee(1,"Nandini");
		Employee e2=new Employee(2,"Nida");
		map.put(1,e1);
		map.put(2,e2);
		Employee fetched1=map.get(1);
		Employee fetched2=map.get(2);
		MapEx1 ex=new MapEx1();
		ex.printByEntries(map);
	}
	
	public void print(Map<Integer,Employee>map) {
		Set<Integer>keys=map.keySet();
		for(int key:keys) {
			Employee value=map.get(key);
			System.out.println(value.getId()+" "+value.getName());
		}
	}
	

	public void printByEntries(Map<Integer,Employee>map) {
		Set<Map.Entry<Integer,Employee>>entries=map.entrySet();
		for(Map.Entry<Integer,Employee>entry:entries) {
			int key=entry.getKey();
			Employee value=entry.getValue();
			System.out.println(value.getName());
		}
	}
	
	
	public void printByValues(Map<Integer,Employee>map) {
		Collection<Employee>values=map.values();
		for(Employee e:values) {
			System.out.println(e.getName());
		}
	}
	
	
	public void printBykeys(Map<Integer,Employee>map) {
		Set<Integer>keys=map.keySet();
		for(int key:keys) {
			Employee value=map.get(key);
			System.out.println(value.getName());
		}
	}
}
