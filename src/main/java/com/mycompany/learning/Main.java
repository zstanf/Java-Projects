/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.learning;

/**
 *
 * @author sfedun
 */
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
