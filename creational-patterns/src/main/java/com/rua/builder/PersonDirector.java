package com.rua.builder;

public class PersonDirector {

	public Person construcPereson(PersonBuilder builder){
		builder.buildHead();
		builder.buildBody();
		builder.buildFoot();
		return builder.buildPerson();
	}
}
