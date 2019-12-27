
public class CalculatorMain {
public static void main(String[] args) {
	Calc calc=new Calc();
	int intResult=calc.add(10,20);
	System.out.println(intResult);
	float floatResult=calc.add(10.5f, 20.2f);
	System.out.println(floatResult);
}
}
