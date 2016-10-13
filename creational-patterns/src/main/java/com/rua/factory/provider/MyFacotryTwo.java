package com.rua.factory.provider;

import com.rua.factory.normal.MyInterface;
import com.rua.factory.normal.Two;

public class MyFacotryTwo implements Provider {

	public MyInterface create() {
		// TODO Auto-generated method stub
		return new Two();
	}

}
