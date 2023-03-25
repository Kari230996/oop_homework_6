public class Peasant extends Character {
    public Peasant(String name, int x, int y) {
        super(name, 1, 1, 0, 1, 1, 3, 1, 0, 0, new Point(x, y));

    }

    // Действия
    @Override
    public void attack(Character enemy) {
        int damage = this.getAttack();
        System.out.println("Peasant attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        int damageReduced = this.getDefense() * 2;
        System.out.println("Peasant uses defend. Damage reduced by " + damageReduced);
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
        return "Peasant";
    }

    @Override
    public void step() {
        Point currentPosition = this.getPosition();
        Point nextPosition = new Point(currentPosition.getX(), currentPosition.getY() + 1);

        if (nextPosition.getY() < 10) {
            this.setPosition(nextPosition);
            System.out.println(this.getClass().getSimpleName() + " moved to position " + nextPosition.toString());
        } else {
            System.out.println(this.getClass().getSimpleName() + " can't move any further");
        }
    }

}
