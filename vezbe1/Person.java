package vezbe1;

public class Person {
	private String name;
	private Brain brain;
	public Person() {
		System.out.println("Constructor running");
	}
	public Person(String name) {
		this.name=name;
		this.brain=new Brain();
	}
	public void writeName() {
		System.out.println("My name is "+this.name);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
