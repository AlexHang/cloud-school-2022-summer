package com.alexhang;

public class MyClass {
    private int a;
    private int b;

    public MyClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public String returnHello(String name){
        return "Hello, " + name;
    }

}
