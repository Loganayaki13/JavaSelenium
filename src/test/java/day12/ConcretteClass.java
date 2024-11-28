package day12;

public  class ConcretteClass extends InterfaceImplementation {

	public static void main(String[] args) {

		ConcretteClass obj = new ConcretteClass();
		obj.print();
		System.out.println(obj.printReturn());
		obj.add();

	}

	@Override
	public int printReturn() {

		return 10;
	}

}
