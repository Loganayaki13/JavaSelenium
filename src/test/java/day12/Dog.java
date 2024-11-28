package day12;

public class Dog {

	private String name; // directly we can't access private variable,
	                      //only possible using getter and setter methods
	private String bread;

	public Dog(String name, String bread)//constructor
	{
		this.name = name;
		this.bread = bread;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public static void main(String[] args) {
		Dog obj = new Dog("jackie", "pulldog");

		// print the initial values
		System.out.println("Name: " + obj.name);
		System.out.println("Bread: " + obj.bread);

		// update the values
		
		//obj.setName("Tommy");
		//obj.setBread("Pug");
             //or create another obj and modify
		Dog obj1 = new Dog("jandu", "pug");
		
		// print the modified values
		System.out.println("Modified values: ");
		System.out.println("Name: " + obj1.name);
		System.out.println("Bread: " + obj1.bread);

	}

}
