import java.util.Random;



public class Infantry extends Character {
    public Infantry(String name, int x, int y) {
        super(name, 5, 2, 0, 2, 8, 4, 0, 0, 0, new Point(x, y));

    }

    @Override
    public void attack(Character enemy) {
        int damage = new Random().nextInt(this.getAttack() * 2) + 1;
        System.out.println("Infantry attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        this.setHealth(this.getHealth() + 1);
        System.out.println("Infantry uses defend. Health is increased by 1");

    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(
                this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());

    }

    @Override
    public String getInfo() {
        return "Infantry";
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