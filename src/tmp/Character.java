package tmp;

public abstract class Character implements skills {
    private int hp;
    private int manaPull;
    private Weapon weapon;

    public Character(int hp, int manaPull, Weapon weapon) {
        this.hp = hp;
        this.manaPull = manaPull;
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }
    public int getManaPull() {
        return manaPull;
    }
    public Weapon getWeapon() {
        return weapon;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setManaPull(int manaPull) {
        this.manaPull = manaPull;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {}
}
