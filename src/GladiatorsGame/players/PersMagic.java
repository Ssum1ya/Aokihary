package GladiatorsGame.players;

import GladiatorsGame.SpecialAttackSkill;
import GladiatorsGame.HealSkills;
import GladiatorsGame.Weapons.Weapon;

public class PersMagic extends Pers implements HealSkills {
    private final int passiveManaHeal;
    public PersMagic(int hp, int mana, int passiveManaHeal, int attack) {
        super(hp, mana);
        this.passiveManaHeal = passiveManaHeal;
        this.weapon = new PersMagic.Staff(attack);
        showInfo();
    }

    @Override
    protected void showInfo() {
        super.showInfo();
        System.out.println("passiveManaHeal - " + this.passiveManaHeal);
    }

    @Override
    public void healHp() {
        if (countHealHp != 0) {
            setHp((int) (getHp() + getHp() * 0.25));
            countHealHp--;
            System.out.println("Маг регенирирует 25% hp hp -- " + getHp());
        } else {
            System.out.println("У вас не осталось хилок");
        }
    }

    @Override
    public void healMana() {
        if (countHealMana != 0) {
            setMana((int) (getMana() + getMana() * 0.5));
            countHealMana--;
            System.out.println("Маг регенирирует 50% mana mana -- " + getMana());
        } else {
            System.out.println("У вас не осталось хилок");
        }
    }

    public class Staff extends Weapon implements SpecialAttackSkill {

        protected Staff(int attack) {
            super(attack);
        }

        @Override
        public void attackSkill(Pers enemy) {
            //TODO: с учетом зашиты
            System.out.println(!(enemy.getClass().equals(this.getClass())));
            enemy.setHp((int) (enemy.getHp() - getMana() * 0.35));
            setMana((int) (getMana() * 0.5));
            System.out.println("Маг использует свой скилл при этом теряя 50 % mana, mana -- " + getMana());
            System.out.println("У врага осталось - " + enemy.getHp());
            setMana(getMana() + passiveManaHeal);
            System.out.println("Маг регенирирует ману с помощью пассивки mana -- " + getMana());
        }
    }
}
