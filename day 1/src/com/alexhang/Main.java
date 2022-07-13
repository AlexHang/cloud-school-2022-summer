package com.alexhang;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyClass m = new MyClass(1,2);
        m.sayHello();


        String s = m.returnHello("Alex");
        System.out.println(s);
        System.out.println(s.equals("Hello, Alex"));

    }

    private static void example1(){
        int a = 5;
        double b = 5.5;
        float c = 2.4f;
        char d = '$';
        boolean e = true;

        Integer a1 = a;

        int a2 = (int) c;


        int i;

        i =5;

        int x;


        if(a==1)
            System.out.println("low");
        else if(a==2)
            System.out.println("not so low");
        else if(a==3)
            System.out.println("");
        else if(a==10)
            System.out.println("very good");


        switch (a){
            case 1:
                System.out.println("low");
                break;
            case 2:
                System.out.println("not so low");
                break;
            default:
                System.out.println("not found");
                break;
        }


        for(int i=0; i<5; i++){
            if(i==2)
                break;
            if(i==3)
                continue;
        }

        int i = 0;
        while(i<5){

            i++;
        }


        do{

        }while(i<5)


    }

}