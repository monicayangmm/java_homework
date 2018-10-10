package com.example.web.Exer;

public class Singleton {
	//饿汉模式
	//私有的默认构造器
//	private Singleton(){
//	}
	//已经自行实例化
//	private static final Singleton Instance=new Singleton();
//	public Singleton getInstance(){   
//        return Instance;  
//    }  
//    懒汉模式
	//私有的默认构造器
	private Singleton(){  
    }  
    private static Singleton Instance=null;  
    public Singleton getInstance(){   
        if(Instance==null){  
            synchronized (Singleton.class) {  
                if(Instance==null)  
                {  
                    Instance=new Singleton();  
                    return Instance;  
                }  
            }  
        }  
        return Instance;  
    }
    //静态内部类单例模式
//    private Singleton(){}  
//    private static Singleton getInstance(){  
//        return SingletonHolder.Instance;  
//    }  
//    /** 
//     * 静态内部类 
//     */  
//    private static class SingletonHolder{  
//        private static final Singleton Instance = new Singleton();  
//    }
}
