package com.rua.factory.sigleton;

public class MyObject {
	private static MyObject myObject;
	private MyObject(){
		
	}
	
	public static MyObject getInstance(){
		if(myObject != null){
		}else{
			myObject = new MyObject();
		}
		return myObject;
	}
	//会引发多线程问题，参考《Java多线程编程核心技术》第六章。
}
