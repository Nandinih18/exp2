
public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp[]=new Employee[4];
		emp[0]=new Employee(101,"Ram",500);
		emp[1]=new Employee(102,"Karan",600);
		emp[2]=new Employee(103,"Arjun",1000);
		emp[3]=new Manager(104,"Rani");
		emp[0].addSalary(100);
		emp[1].addSalary(200);
		emp[2].addSalary(300);
		
		EmployeeMain m=new EmployeeMain();
		m.print(emp);
		
	}
	void print(Employee[] e) {
		for(int i=0;i<4;i++) {
			System.out.println("id:"+e[i].getId()+"Name:"+e[i].getName()+"Balance:"+e[i].getBalance());
		}
	}
}
