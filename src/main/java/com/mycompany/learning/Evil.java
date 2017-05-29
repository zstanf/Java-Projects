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
public class Evil extends Hero {
     
    protected int evilLvl = 0;
    
    public Evil (){
    }

    public void setEvilLvl(int evilLvl) {
        this.evilLvl = evilLvl;
    }

    public int EvilLvl() {
        return this.evilLvl;
    }
    
    public void creationNewHero(){
        super.creationNewHero();
        System.out.println("| My Evil-lvl: "+this.evilLvl);
    }
     
}
