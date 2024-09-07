package com.curso.patronesCreacionales.prototype;

public class Warrior extends Enemy{
    private int endurace;

    public Warrior(int health, int damage, int endurace) {
        super(health, damage);
        this.endurace = endurace;
    }

    public Warrior(Warrior warrior) {
        super(warrior);
        if (warrior != null) {
            setEndurace(warrior.getEndurace());
        }
    }

    public Warrior(Enemy enemy, int endurace) {
        super(enemy);
        this.endurace = endurace;
    }

    public int getEndurace() {
        return endurace;
    }

    public void setEndurace(int endurace) {
        this.endurace = endurace;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "endurace=" + endurace +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }

    @Override
    public Enemy clone() {
        return new Warrior(this);
    }
}
