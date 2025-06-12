package GladiatorsGame.players;

import GladiatorsGame.SpecialAttackSkill;
import GladiatorsGame.HealSkills;
import GladiatorsGame.Weapons.Weapon;

public class PersWarrior extends Pers implements HealSkills {
    private final double percentDefend;

    public PersWarrior(int hp, int mana, double percentDefend, int attack) {
        super(hp, mana);
        this.percentDefend = percentDefend;
        this.weapon = new Sword(attack);
        showInfo();
    }

    @Override
    protected void showInfo() {
        super.showInfo();
        System.out.println("percentDefend - " + this.percentDefend);
    }

    @Override
    public void healHp() {
        if (countHealHp != 0) {
            setHp((int) (getHp() + getHp() * 0.5));
            countHealHp--;
            System.out.println("Воин регенирирует 50% hp hp -- " + getHp());
        } else {
            System.out.println("У вас не осталось хилок");
        }
    }

    @Override
    public void healMana() {
        if (countHealMana != 0) {
            setMana((int) (getMana() + getMana() * 0.25));
            countHealMana--;
            System.out.println("Воин регенирирует 25% mana mana -- " + getMana());
        } else {
            System.out.println("У вас не осталось хилок");
        }
    }

    public class Sword extends Weapon implements SpecialAttackSkill {

        protected Sword(int attack) {
            super(attack);
        }

        @Override
        public void attackSkill(Pers enemy) {
            //TODO: с учетом зашиты
            enemy.setHp((int) (enemy.getHp() - getHp() * 0.4));
            setHp((int) (getHp() * 0.5));
            System.out.println("Воин использует свой скилл при этом теряя 50 % hp, hp -- " + getHp());
            System.out.println("У врага осталось - " + enemy.getHp());
        }
    }
}
