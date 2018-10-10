package com.example.web.Exer;

public class Test2 {
	private String title;
    private static Test2 manSex = new Test2("Man");
    private static Test2 womenSex = new Test2("Women");
    private Test2(String title){
        this.title = title;
    }
    public static Test2 getInstance(int choose){
        switch (choose) {
        case Choose.MAN:
            return manSex;
        default:
            return womenSex;
        }
    }
    public String getTitle(){
        return title;
    }
} 

interface Choose{
    public int MAN = 1;
    public int WOMEN = 2;
}


