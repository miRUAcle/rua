package com.rua.builder;

public class ManBuilder implements PersonBuilder {
	
	Person person;
	
	public ManBuilder(){
		person = new Person();
	}

	public void buildHead() {
		person.setHead("build head");

	}

	public void buildBody() {
		person.setBody("build body");

	}

	public void buildFoot() {
		person.setFoot("build foot");

	}
	
	public Person buildPerson(){
		return person;
	}

}
