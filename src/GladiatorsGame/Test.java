package GladiatorsGame;

import GladiatorsGame.players.PersMagic;
import GladiatorsGame.players.PersWarrior;

public class Test {
    public static void main(String[] args) {
        PersMagic persMagic = new PersMagic(50, 200, 30, 10);
        SpecialAttackSkill magicAttackSkill = (SpecialAttackSkill) persMagic.getWeapon();
        HealSkills magicHealSkills = (HealSkills) persMagic;

        PersWarrior persWarrior = new PersWarrior(12, 12 ,0.2, 14);
        SpecialAttackSkill warriorAttackSkill = (SpecialAttackSkill) persWarrior.getWeapon();
        HealSkills warriorHealSkills = (HealSkills) persWarrior;

        persWarrior.getWeapon().attack(persMagic);
        magicHealSkills.healHp();
        warriorAttackSkill.attackSkill(persMagic);
        persMagic.getWeapon().attack(persWarrior);
        magicAttackSkill.attackSkill(persWarrior);
    }
}
