package org.academiadecodigo.bootcamp.simulation.entities;

public class Projectile implements Projectable {

    int damage;

    @Override
    public void doDamage(Hitable hitable) {
        hitable.hit(damage);
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
