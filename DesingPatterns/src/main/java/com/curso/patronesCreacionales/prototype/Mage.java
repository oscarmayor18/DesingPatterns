package com.curso.patronesCreacionales.prototype;

public class Mage extends Enemy{
    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Mage(int health, int damage, int mana) {
        super(health, damage);
        this.mana = mana;
    }

    public Mage(Mage mage) {
        super(mage);
        if (mage != null) {
            setMana(mage.getMana());
        }
    }

    public Mage(Enemy enemy, int mana) {
        super(enemy);
        this.mana = mana;
    }

    @Override
    public Enemy clone() {
        return new Mage(this);
    }

    @Override
    public String toString() {
        return "Mage{" +
                "mana=" + mana +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
