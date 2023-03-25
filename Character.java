
public abstract class Character implements Hero {
    // Свойства
    private String name;
    protected int attack;
    protected int defense;
    protected int shots;
    protected int damage;
    protected int health;
    protected int speed;
    protected int delivery;
    protected int magic;
    protected int arrows;
    protected Point position;

    public Character(String name, int attack, int defense, int shots, int damage, int health, int speed, int delivery,
            int magic, int arrows, Point point) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.arrows = arrows;
        this.position = point;
    }

    // Методы
    public abstract void attack(Character enemy);

    public abstract void defend();

    public abstract void takeDamage(int damage);

    @Override
    public void step() {
        System.out.println("Character is stepping forward!");
    }

    public boolean isAlive() {
        return health > 0;
    }

    // Геттеры и сеттеры для свойств


    public String getName() {
        return this.name;
    }

    public int getAttack() {
        return attack;
    }

    public int setAttack(int attack) {
        return this.attack;
    }

    public int getDefense() {
        return defense;
    }

    public int setDefense(int defense) {
        return this.defense;
    }

    public int getShots() {
        return shots;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDelivery() {
        return delivery;
    }

    public int getMagic() {
        return magic;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}