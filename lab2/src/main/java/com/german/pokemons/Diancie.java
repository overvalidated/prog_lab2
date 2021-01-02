package com.german.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.german.moves.*;

public class Diancie extends Pokemon {
    public Diancie(String name) {
        super(name, 1);
        setType(Type.ROCK, Type.FAIRY);
        setStats(50, 100, 150, 100, 150, 50);
        setMove(new Psychic(),
                new AncientPower(),
                new RockSlide(),
                new Swagger());
    }

}
