package com.rua.prototype;

import java.io.IOException;
/**
 * 
 * don't understand what's this.
 *
 */
public class App {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Prototype proto = new Prototype();
		proto.setBase(1);
		proto.setObj(new Integer(2));
		
		Prototype proto2 = (Prototype)proto.deepClone();
		System.out.println(proto.getObj() == proto.getObj());
		System.out.println(proto.getObj() == proto2.getObj());
		
	}

}
