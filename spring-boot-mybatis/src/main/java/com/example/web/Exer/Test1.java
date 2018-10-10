package com.example.web.Exer;

public class Test1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//该类只能有一个实例
	private Test1(){}
	//该类必须自行创建
	//饿汉模式
	private static final Test1 ts=new Test1();
	public static Test1 getTest(){
		return ts;
	}

	//懒汉模式
//	private static Test1 ts1=null;
//	//这个类必须自动向整个系统提供这个实例对象
//	public static Test1 getTest(){
//		if(ts1==null){
//			ts1=new Test1();
//		}
//		return ts1;
//	}
	public void getInfo(){
		System.out.println("Output message"+name);
	}
}
