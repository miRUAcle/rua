package com.rua.prototype;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int base;
	
	private Integer obj;
	
	//浅复制
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype)super.clone();
		return proto;
	}
	
	//深复制
	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		ObjectOutputStream	objectOutput = new ObjectOutputStream(output);
		objectOutput.writeObject(this);
		
		ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());
		
		ObjectInputStream objectInput = new ObjectInputStream(input);
		return objectInput.readObject();
	}
	
	public int getBase(){
		return base;
	}
	
	public void setBase(int base){
		this.base = base;
	}
	
	public Integer getObj(){
		return obj;
	}
	
	public void setObj(Integer obj){
		this.obj = obj;
	}
}
