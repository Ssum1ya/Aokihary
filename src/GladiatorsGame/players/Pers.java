package GladiatorsGame.players;

import GladiatorsGame.Weapons.Weapon;

public class Pers {
    private int hp;
    private int mana;
    Weapon weapon;
    int countHealHp = 2;
    int countHealMana = 2;

    protected Pers(int hp, int mana) {
        this.hp = hp;
        this.mana = mana;
    }

    protected void showInfo() {
        System.out.println("Create object of " + this.getClass());
        System.out.println("hp - " + this.hp);
        System.out.println("mana - " + this.mana);
    }

    public void setHp(int hp) {this.hp = hp;}
    public int getHp() {return hp;}

    public void setMana(int mana) {this.mana = mana;}
    public int getMana() {return mana;}

    public Weapon getWeapon() {return weapon;}
}