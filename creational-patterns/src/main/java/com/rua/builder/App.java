package com.rua.builder;
/**
 * Construct a complex object,
 * split it into different part 
 * and make each part has different implementation.
 */
public class App {

	public static void main(String[] args) {
		PersonDirector director = new PersonDirector();
		Person person = director.construcPereson(new ManBuilder());
		System.out.println(
				person.getHead() + ",\n" + person.getBody() + ",\n" + person.getFoot() + ",\n" + "mission complete!");
	}
}
