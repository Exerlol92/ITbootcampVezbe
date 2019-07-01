package vezbe1;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Person p1=new Person("Dusan");
		String name = p1.getName();
        name = name + " Ljesevic";
        p1.setName(name);
		p1.writeName();
	}

}
