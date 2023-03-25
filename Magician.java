
public class Magician extends Character {
    public Magician(String name, int x, int y) {
        super(name, 17, 12, 0, -5, 30, 9, 0, 1, 0, new Point(x, y));
    }

    @Override
    public void attack(Character enemy) {
        int damage = this.getMagic() * 2;
        System.out.println("Magician attacks " + enemy.getClass().getSimpleName() + " with a damage of " + damage);
        enemy.takeDamage(damage);
    }

    @Override
    public void defend() {
        this.setDefense(this.getDefense() + 1);
        System.out.println("Magician uses defend. Agility is increased by 1.");
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        System.out.println(
                this.getClass().getSimpleName() + " takes " + damage + " damage. Health is now " + this.getHealth());
    }

    @Override
    public String getInfo() {
        return "Magician";
    }

    @Override
    public void step() {
        // метод step для колдуна
    }

}
