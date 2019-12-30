package emp;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp[]=new Employee[4];
		emp[0]=new Employee(101,"Ram",500);
		emp[0].addSalary(100);
		emp[1]=new Employee(102,"Karan",600);
		emp[1].addSalary(200);
		emp[2]=new Employee(103,"Arjun",1000);
		emp[2].addSalary(300);
		
		Manager m1=new Manager(2,"chandra");
		emp[3]=m1;
		m1.addManagedEmployee(emp[0]);
		m1.addManagedEmployee(emp[1]);
		
		EmployeeMain m=new EmployeeMain();
		m.print(emp);
		
	}
	public void print(Employee[]employees) {
		for (Employee e:employees) {
			System.out.println(e.getName()+e.getBalance());
			boolean isManager=e instanceof Manager;
			if(isManager) {
				Manager m= (Manager) e;
				System.out.println("Managed employees");
				Employee[] managedEmployees= m.getManagedEmployees();
				for(Employee managed:managedEmployees) {
					if(managed!=null) {
						System.out.println(managed.getName()+" "+managed.getBalance());
					}
				}
			}
		}
	}
}
