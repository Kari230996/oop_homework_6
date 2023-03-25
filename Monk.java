public class Monk extends Character {
    public Monk(String name, int x, int y) {
        super(name, 12, 7, 0, -4, 30, 5, 0, 1, 0, new Point(x, y));
    }

    @Override
    public void attack(Character enemy) {
        int damage = this.getAttack() + this.getMagic();
        System.out.println("Monk attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        int damageReduced = this.getDefense() * 2;
        System.out.println("Monk uses defend. Damage reduced by " + damageReduced);
        this.setHealth(this.getHealth() + damageReduced);
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(
                this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public String getInfo() {
        return "Monk";
    }

    @Override
    public void step() {
        // метод step для арбалетчика
    }

}
