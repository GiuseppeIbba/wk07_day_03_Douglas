package items;

import behaviours.IDamage;
import beings.Being;
import beings.creatures.Enemy;


public class Weapon extends Item implements IDamage {
    
    private int damage;

    public Weapon(String type, int damage) {
        super(type);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void dealDamage(Being target){

    }

}
