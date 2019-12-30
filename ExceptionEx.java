package exceptions;

import emp.*;

public class ExceptionEx{
		private Employee employee;
		
		public static void main(String[]args) {
			ExceptionEx ex=new ExceptionEx();
			try {
			ex.execute();
			}
			catch(IncorrectIdException exception) {
			System.out.println("id was incorrect");
			}
			catch(Exception e) {
			System.out.println("something went wrong");
			}
			finally {
				System.out.println("always gets executed");
			}
			
			System.out.println("after execute in main");
			
		}
		
		public void execute() {
			/* try {
				throw new NullPointerException();
				//int id= employee.getId();
				System.out.println("after handling exception");
			} catch (Throwable e) {
				e.printStackTrace();
				System.out.println("handled exception");
			} */
			
			RuntimeException e=new IncorrectIdException("id cant be negative");
			throw e;
		}

	}



