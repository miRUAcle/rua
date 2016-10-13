package com.rua.factory.normal;

public class MyFactoryV2 {

	public MyInterface createOne(){
		return new One();
	}
	
	public MyInterface createTwo(){
		return new Two();
	}
}
