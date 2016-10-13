package com.rua.factory.normal;

import com.rua.factory.provider.MyFactoryOne;
import com.rua.factory.provider.Provider;

/**
 * 3 kinds of factory: normal, static, abstract. 
 * Notice the problem that abstract mode will cause.
 * */
public class App {
	public static void main(String[] args) {
		MyFactory factory = new MyFactory();
		MyInterface myInterface = factory.create("One");
		myInterface.print();
		
		MyFactoryV2 factoryV2 = new MyFactoryV2();
		MyInterface myInterfaceV2 = factoryV2.createTwo();
		myInterfaceV2.print();
		
		MyInterface myInterfaceV3 = MyFactoryV3.createOne();
		myInterfaceV3.print();
		
		Provider provider = new MyFactoryOne();
		MyInterface myInterfaceV4 = provider.create();
		myInterfaceV4.print();
	}
}
