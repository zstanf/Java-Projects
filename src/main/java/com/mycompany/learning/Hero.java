
package com.mycompany.learning;

public class Hero {

//Переменные 
    protected String name = "unknown";
    protected String race = "unknown";
    protected String spec = "unknown";
    protected int lvl = 0;
    protected String castle = "unknown";
    
    public Hero(){
        
    }
    
    public Hero(String name, String race, String spec, int lvl){
        this.name = name;
        this.race = race;
        this.spec = spec;
        this.lvl = lvl;
    }

//Сеттеры   
    public void setName(String n){
        this.name = n;
    }
    
    public void setRace(String r){
        this.race = r;
    }   
    
    public void setSpec(String s){
        this.spec = s;
    }    
    
    public void setLvl(int l){
        this.lvl = l;
    }

     public void setCastle(String c) {
        this.castle = c;
    }
    
//Геттеры    
    public String name() {
        return this.name;
    }
    
    public String race() {
        return this.race;
    }
        
    public String spec() {
        return this.spec;
    }
        
    public int lvl() {
        return this.lvl;
    }
    
    public String castle() {
        return this.castle;
    }
    
    public void creationNewHero(){
        System.out.println("____________________________________");
        System.out.println("| Hero name: "+name);
        System.out.println("| Hero race: "+race);
        System.out.println("| Hero class: "+spec);
        System.out.println("| Hero lvl: "+lvl);
        System.out.println("| Hero castle: "+castle);
        
    }
    
}
