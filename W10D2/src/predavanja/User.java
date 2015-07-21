package predavanja;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -5907395647707803112L;

	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return String.format("%s %d", name, age);
	}

}
