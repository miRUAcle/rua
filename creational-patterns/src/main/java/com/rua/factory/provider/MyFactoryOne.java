package com.rua.factory.provider;

import com.rua.factory.normal.MyInterface;
import com.rua.factory.normal.One;

public class MyFactoryOne implements Provider {

	public MyInterface create() {
		
		return new One();
	}

}
