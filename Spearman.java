public class Spearman extends Character {
    public Spearman(String name, int x, int y) {
        super(name, 4, 5, 0, 3, 10, 4, 0, 0, 0, new Point(x, y));
    }

    @Override
    public void attack(Character enemy) {
        int damage = this.getAttack() * 2;
        System.out.println("Spearman attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        int damageReduced = this.getDefense() / 2;
        System.out.println("Spearman uses defend. Damage reduced by " + damageReduced);
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
        return "Spearman";
    }

    @Override
    public void step() {
        // метод step для копейщика
    }
}
