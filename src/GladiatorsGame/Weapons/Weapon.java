package GladiatorsGame.Weapons;

import GladiatorsGame.players.Pers;

public abstract class Weapon {
    protected int attack;

    protected Weapon(int attack) {
        this.attack = attack;
    }
    public void attack(Pers enemy) {
        //TODO: с учетом зашиты
        enemy.setHp(enemy.getHp() - this.attack);
        System.out.println("Атакуем Врага");
        System.out.println("У врага осталось - " + enemy.getHp());
    }
}
