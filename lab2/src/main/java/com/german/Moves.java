package com.german;

import java.lang.String;
import java.lang.Math;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.StatusMove;


class Psychic extends SpecialMove {
    Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    public String describe() {
        return "casts Psychic";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect debuff = new Effect()
                .chance(0.1)
                .stat(Stat.SPECIAL_DEFENSE, -1);
        opp.addEffect(debuff);
    }
    
}

class ShadowBall extends SpecialMove {
    ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    public String describe() {
        return "casts Shadow Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect debuff = new Effect()
                .chance(0.2)
                .stat(Stat.SPECIAL_DEFENSE, -1);

        opp.addEffect(debuff);
    }

}

class AncientPower extends SpecialMove {
    AncientPower() {
        super(Type.ROCK, 60, 100);
    }

    @Override
    public String describe() {
        return "casts Ancient Power";
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        Effect effect = new Effect().chance(0.1)
                .stat(Stat.ATTACK, 1)
                .stat(Stat.DEFENSE, 1)
                .stat(Stat.SPECIAL_ATTACK, 1)
                .stat(Stat.SPECIAL_DEFENSE, 1)
                .stat(Stat.SPEED, 1);

        self.addEffect(effect);
    }

}

class RockSlide extends PhysicalMove {
    RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    public String describe() {
        return "casts Rock Slide";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        if (Math.random() < 0.1) {
            Effect.flinch(opp);
        }
    }

}

class Swagger extends StatusMove {
    Swagger() {
        super();
        this.type = Type.NORMAL;
        this.accuracy = 85;
    }

    @Override
    public String describe() {
        return "casts Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect.confuse(opp);
        opp.setMod(Stat.ATTACK, 1);
    }

}

class Swift extends SpecialMove {
    Swift() {
        super(Type.NORMAL, 60, 100);
    }

    @Override
    public String describe() {
        return "casts Swift";
    }

    @Override
    protected boolean checkAccuracy(Pokemon arg0, Pokemon arg1) {
        return true;
    }



}

class WorkUp extends StatusMove {
    WorkUp() {
        super();
        this.type = Type.NORMAL;
    }

    @Override
    public String describe() {
        return "casts Work Up";
    }

    @Override
    protected boolean checkAccuracy(Pokemon arg0, Pokemon arg1) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        self.addEffect(new Effect().
                stat(Stat.ATTACK, 1).
                stat(Stat.SPECIAL_ATTACK, 1));
    }

}

class DreamEater extends SpecialMove {
    DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    public String describe() {
        return "casts Dream Eater";
    }

    @Override
    protected double calcRandomDamage(Pokemon self, Pokemon opp) {
        return opp.getCondition().equals(Status.SLEEP) ? super.calcRandomDamage(self, opp) : 0.0;
    }

    @Override
    protected void applySelfDamage(Pokemon self, double damage) {
        self.setMod(Stat.HP, (int)Math.round(damage/2));
    }

}

class TeeterDance extends StatusMove {
    TeeterDance() {
        super(Type.NORMAL, 100, 100);
    }

    @Override
    public String describe() {
        return "casts Teeter Dance";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect.confuse(opp);
    }

}

class PlayNice extends StatusMove {
    PlayNice() {
        super();
        this.type = Type.NORMAL;
    }

    @Override
    public String describe() {
        return "casts Play Nice";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        opp.setMod(Stat.ATTACK, -1);
    }

}

class Rest extends StatusMove {
    Rest() {
        super(Type.NORMAL, 100, 100);
    }

    @Override
    public String describe() {
        return "casts Rest";
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        self.setMod(Stat.HP, -(int)(self.getStat(Stat.HP)-self.getHP()));
        self.setCondition(new Effect().turns(2).condition(Status.SLEEP));
    }

}