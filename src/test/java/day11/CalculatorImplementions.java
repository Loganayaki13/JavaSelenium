package day11;

public class CalculatorImplementions {

	public static void main(String[] args) {
	
		Calc2 obj=new Calc2(); //single inheritance
		
		obj.num1=10;
		obj.num2=20;
		//System.out.println("Add value :"+obj.add());
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.mod();
		
		System.out.println("Single level inheritance excuted");
		
		Calc3 obj1=new Calc3();//multilevel inheritance
		obj1.num1=100;
		obj1.num2=50;
		//System.out.println("Add value :"+obj1.add());
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		obj1.mod();
		obj1.cos();
		obj1.tan();
		
		System.out.println("Multi level inheritance excuted");
		
		//Hierarchy inheritance
		System.out.println("Hierarchy inheritance excuted");
		Calc4 obj2=new Calc4();
		obj2.num1=100;
		obj2.num2=50;
		//System.out.println("Add value :"+obj2.add());
		obj2.sub();
		obj2.mul();
		obj2.div();
		obj2.percentage();
	}

}
