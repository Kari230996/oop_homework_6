public class Sniper extends Character {
    public Sniper(String name, int x, int y) {
        super(name, 12, 10, 32, 10, 15, 9, 0, 0, 0, new Point(x, y));
    }

    // Действия
    @Override
    public void attack(Character enemy) {
        int damage = this.getAttack() * 3;
        System.out.println("Sniper attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);

    }

    @Override
    public void defend() {
        this.setHealth(this.getHealth() + 2);
        System.out.println("Sniper uses defend. Agility is increased by 2.");
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(
                this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }

    @Override
    public void step() {
        // метод step для снайпера
    }

}
