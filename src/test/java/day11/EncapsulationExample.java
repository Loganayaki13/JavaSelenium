package day11;

public class EncapsulationExample {

	private String name;
	private int age;

	// by using eclipse shortcut
	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 */

	// own way to write get and set method
	
	  public void setName(String name) {
	  
	  this.name=name;
	  }
	  
	  public void setAge(int age) {
	  
	  this.age=age; 
	  }
	  
	  public void getName() {
	  
	  System.out.println("Name: "+name); 
	  }
	  
	  public void getAge() {
	  
	  System.out.println("Age: "+age);
	  }
	  
	 

}
