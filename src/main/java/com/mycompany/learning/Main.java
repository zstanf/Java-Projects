package com.mycompany.learning;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        test2();
        
        Main main = new Main();
        main.test();
    }
    
    public void test(){
        System.out.println("test");
    }
    
    public static void test2() {
        System.out.println("test2");
    }
}
