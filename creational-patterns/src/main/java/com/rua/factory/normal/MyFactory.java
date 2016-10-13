package com.rua.factory.normal;

public class MyFactory {

	public MyInterface create(String type){
		if("One".equals(type)){
			return new One();
		}else if("Two".equals(type)){
			return new Two();
		}else{
			System.out.println("There is no this type.");
			return null;
		}
	}
}
