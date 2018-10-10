package com.example.web.Exer;

public class TestMain {
	public static void main(String[] args) {
		//单例模式测试例子
//		Test1 test= Test1.getTest();
//		test.setName("张三");
//		System.out.println(test.getName());
//		
//		Test1 test2= Test1.getTest();
//		test2.setName("李四");
//		System.out.println(test2.getName());
//		
//		test.getInfo();
//		test2.getInfo();
//		
//		if(test == test2){
//			System.out.println("同一个例子");
//		}else if(test != test2){
//			System.out.println("不同的例子");
//		}else{
//			System.out.println("出错");
//		}
		//多例模式测试例子
		Test2 sex = Test2.getInstance(Choose.MAN);
        System.out.println(sex.getTitle());
        Test2 sex2 = Test2.getInstance(Choose.WOMEN);
        System.out.println(sex2.getTitle());
	}

}
