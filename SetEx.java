package emp;
import java.util.*;

public class SetEx {
	public static void main(String[]args) {
		Employee e1=new Employee(1,"chandra");
		Employee e2=new Employee(2,"satya");
		Employee e3=new Employee(3,"pranav");
		Employee e4=new Employee(1,"chandra");
		Set set=new HashSet();
		boolean added=set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		int size=set.size();
		System.out.println("size="+size);
		boolean contains=set.contains(e2);
		System.out.println("set contains e2="+contains);
		SetEx ex=new SetEx();
		ex.print(set);
		boolean removed=set.remove(e2);
		System.out.println("removed="+removed);
		ex.print(set);
	}
	
	public void print(Set set) {
		for(Object o:set) {
			Employee e=(Employee)o;
			System.out.println(e.getId()+" "+e.getName());
		
		}
	}

}
