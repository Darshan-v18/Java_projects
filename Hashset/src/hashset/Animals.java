package hashset;

import java.util.Objects;

public class Animals {
	String name;
	int age;
	
	public Animals(String name, int age) {
		super();
	  	this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animals other = (Animals) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Animals [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
