
package com.mycompany.learning;

import java.util.ArrayList;

public class Castle {
    
    protected String castle = "unknown";
    protected ArrayList<Hero> listOfHeros = new ArrayList<Hero>();
    
    public Castle (String castle){
        this.castle = castle;
    }
    
    public void setCastle(String c) {
        this.castle = c;
    }

    public String Castle() {
        return this.castle;
    }
    
    public void inCastle(Hero h){
        if(listOfHeros.contains(h)) {
            System.out.println("This Hero alredy in this castle!");
        } else {
            listOfHeros.add(h);
            h.setCastle(this.castle);
        }
    }
    
    public void outCastle(Hero h){
        listOfHeros.remove(h);
        h.setCastle("unknown");
    }
    
    public void infoCastle(){
        System.out.println("__________________________");
        System.out.println("| Castle: "+this.castle);
        System.out.println("| Heroes in castle: ");
        
        
        for (int i=0; i<listOfHeros.size();i++){
            Hero h = listOfHeros.get(i);
            System.out.println(h.name);         
        }
    }
}
