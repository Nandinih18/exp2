package emp;

import java.util.*;

import exceptions.IncorrectIdException;

public class EmployeeUi {
	public static void main(String[]args) {
		EmployeeUi ui=new EmployeeUi();
		ui.execute();
	}
	
	Map<Integer,Employee> store=new HashMap<>();
	
	public void execute() {
	    try {
		Employee e1=new Employee(1,"abhinav");
		addEmployee(e1);
		Manager m1=new Manager(2,"chandra");
		addEmployee(m1);
		addEmployee(new Employee(-1,"rachana"));
		m1.addManagedEmployee(e1);
		print();
		Employee fetched=findById(2);
		System.out.println(fetched.getName());
	} catch(IncorrectIdException e) {
		e.printStackTrace();
		System.out.println("incorrect id");
	}
	}
	public void addEmployee(Employee e) {
		int id=e.getId();
		if(id<0) {
			throw new IncorrectIdException("id is negative");
		}
		store.put(id, e);
		}
	
	
	public Employee findById(int id) {
		Employee e=store.get(id);
		return e;
	}

	
	public void print() {
		Set<Integer> keys=store.keySet();
		for (Integer id: keys) {
			Employee e = store.get(id);
			System.out.println(e.getName() + e.getBalance());
			boolean isManager=e instanceof Manager;
			if(isManager) {
				Manager m=(Manager) e;
				System.out.println("managed employees");
				Employee[] managedEmployees = m.getManagedEmployees();
				for(Employee managed: managedEmployees) {
					if(managed != null) {
						System.out.println(managed.getName()+" "+managed.getBalance());
					}
				}
			}
		}
	}

}
