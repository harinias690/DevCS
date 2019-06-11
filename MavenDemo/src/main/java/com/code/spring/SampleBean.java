package com.code.spring;

public class SampleBean {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void draw(){
		System.out.println("Welcome "+msg);
	}

}
