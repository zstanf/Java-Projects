
package com.mycompany.learning;


public class Main {
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Thrall","Orc","Shaman",80);
        Evil hero2 = new Evil();
        
        
        
        Castle castle = new Castle("Orgrimar");
//        castle.castle = "Orgrimar";
//        
//        hero1.name = "Thrall";
//        hero1.race = "Orc";
//        hero1.spec = "Shaman";
//        hero1.lvl = 80;  
//        
        hero2.name = "Silvana";
        hero2.race = "Undead";
        hero2.spec = "Archer";
        hero2.lvl = 60;
        hero2.evilLvl = 11;
        
        castle.inCastle(hero2);
        
        hero1.creationNewHero();
        hero2.creationNewHero();
        
        castle.infoCastle();
        
    }
    
}
