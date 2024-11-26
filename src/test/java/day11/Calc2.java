package day11;

public class Calc2 extends Calc1 {
	@Override
	public void add()//method overriding
	{
		result=num1+num2+1;
		System.out.println("Add with 3 values: " + result);
	}
	
	public void mod() {
		
		result = num1 % num2;
		System.out.println("Mod value "+result);
	}

}
