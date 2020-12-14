package com.german;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class App 
{
    public static void main( String[] args )
    {
        Battle b = new Battle();
        Pokemon p1 = new Diancie("Dia");
        Pokemon p2 = new Eevee("Eve");
        Pokemon p3 = new Espeon("Espy");
        Pokemon p4 = new Bounsweet("Sweety");
        Pokemon p5 = new Steenee("Steen");
        Pokemon p6 = new Tsareena("Reena");
        
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }

}
