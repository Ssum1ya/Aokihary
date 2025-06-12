package tmp.characters;

import tmp.Character;
import tmp.Weapon;

public class Warrior extends Character {
    public Warrior(int hp, int manaPull, Weapon weapon) {
        super(hp, manaPull, weapon);
    }

    @Override
    public void attackSkill(Character enemy) {
        enemy.setHp((int) (enemy.getHp() - enemy.getHp() * 0.1 * 3));
    }

    @Override
    public void manaHeal() {
        this.setManaPull((int) (this.getManaPull() + this.getManaPull() * 0.2));
    }

    @Override
    public void hpHeal() {
        this.setHp((int) (this.getHp() + this.getHp() * 0.4));
    }
}
