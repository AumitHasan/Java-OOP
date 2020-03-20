import java.util.*;
import java.lang.*;
import java.io.*;


public class Person {
	private String name;

	public void setName(String newName) {
    	this.name = newName;
	}
	public String getName() {
    	return name;
	}
}

class Aumit {
  public static void main(String[] args) {
    Person obj = new Person();
    obj.setName("Aumit Hasan");
    System.out.println(obj.getName());
  }
}
