/** Class for Diancie pokemon.
 * @author German Beyger
*/

package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


class Diancie extends Pokemon {
    Diancie(String name) {
        super(name, 1);
        setType(Type.ROCK, Type.FAIRY);
        setStats(50, 100, 150, 100, 150, 50);
        setMove(new Psychic(),
                new AncientPower(),
                new RockSlide(),
                new Swagger());
    }

}

class Eevee extends Pokemon {
    Eevee(String name) {
        super(name, 1);
        setType(Type.NORMAL);
        setStats(55, 55, 50, 45, 65, 55);
        setMove(new ShadowBall(),
                new Swift(),
                new WorkUp());
    }

}

class Espeon extends Pokemon {
    Espeon(String name) {
        super(name, 1);
        setType(Type.PSYCHIC);
        setStats(65, 65, 60, 130, 95, 110);
        setMove(new ShadowBall(),
                new Swift(), 
                new WorkUp(), 
                new DreamEater());
    }

}

class Bounsweet extends Pokemon {
    Bounsweet(String name) {
        super(name, 1);
        setType(Type.GRASS);
        setStats(42, 30, 38, 30, 38, 32);
        setMove(new TeeterDance(),
                new Swagger());
    }

}

class Steenee extends Pokemon {
    Steenee(String name) {
        super(name, 1);
        setType(Type.GRASS);
        setStats(52, 40, 48, 40, 48, 62);
        setMove(new TeeterDance(),
                new Swagger(),
                new PlayNice());
    }

}

class Tsareena extends Pokemon {
    Tsareena(String name) {
        super(name, 1);
        setType(Type.GRASS);
        setStats(72, 120, 98, 50, 98, 72);
        setMove(new TeeterDance(),
                new Swagger(),
                new PlayNice(),
                new Rest());
    }
    
}