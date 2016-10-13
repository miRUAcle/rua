package com.rua.factory.normal;

public class MyFactoryV3 {

	public static MyInterface createOne(){
		return new One();
	}
	
	public static MyInterface createTwo(){
		return new Two();
	}
}
