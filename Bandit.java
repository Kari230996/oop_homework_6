import java.util.Random;


public class Bandit extends Character {
    public Bandit(String name, int x, int y) {
        
        super(name, 8, 3, 0, 4, 10, 6, 0, 0, 0, new Point(x, y));
    }

    // Действие

    @Override
    public void attack(Character enemy) {
        int damage = new Random().nextInt(this.getAttack() * 2) + 1;
        System.out.println("Bandit attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        this.setHealth(this.getHealth() + 1);
        System.out.println("Bandit uses defend. Health is increased by 1.");
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(
                this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public String getInfo() {
        return "Bandit";
    }

    @Override
    public void step() {
        // метод step для разбойника
    }

}
