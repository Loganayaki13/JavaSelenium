package day12;

public class Base implements Showable {

	public static void main(String[] args) {
		
		Base obj=new Base();
		
		obj.add();
		obj.print();
		System.out.println(obj.printReturn());
		obj.show();
		obj.Sample();
	
		

	}

	@Override
	public void print() {
		System.out.println("Printable");
		
	}

	@Override
	public int printReturn() {
		
		return 10;
	}

	@Override
	public void add() {
		System.out.println("Adition");
		
	}

	@Override
	public void show() {
	
		System.out.println("Showable");
		
	}

}
