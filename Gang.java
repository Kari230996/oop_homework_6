
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gang {
    private final List<Character> members;
    private final String name;
    private final Random random;
    private final int size;

    public Gang(String name, int size) {
        this.name = name;
        this.size = size;
        this.random = new Random();
        this.members = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            switch (random.nextInt(4)) {
                case 0:
                    members.add(new Peasant("Peasant " + i, random.nextInt(size), random.nextInt(size)));
                    break;
                case 1:
                    members.add(new Bandit("Bandit " + i, random.nextInt(size), random.nextInt(size)));
                    break;
                case 2:
                    members.add(new Sniper("Sniper " + i, random.nextInt(size), random.nextInt(size)));
                    break;
                case 3:
                    members.add(new Magician("Magician " + i, random.nextInt(size), random.nextInt(size)));
                    break;
                case 4:
                    members.add(new Crossbowman("Crossbowman " + i, random.nextInt(size), random.nextInt(size)));
                    break;
                case 5:
                    members.add(new Monk("Monk " + i, random.nextInt(size), random.nextInt(size)));
                    break;
                case 6:
                    members.add(new Spearman("Spearman " + i, random.nextInt(size), random.nextInt(size)));
                    break;

            }
        }
    }

    public Character get(int index) {
        return members.get(index);
    }

    public void move() {
        for (Character member : members) {
            if (member.isAlive()) {
                Point newPos = member.getPosition().add(Point.getRandomDirection());
                if (newPos.getX() >= 0 && newPos.getX() < size && newPos.getY() >= 0 && newPos.getY() < size) {
                    member.setPosition(newPos);
                }
                Character enemy = getEnemyAtPosition(member.getPosition());
                if (enemy != null) {
                    member.attack(enemy);
                }
            }
        }
    }

    public boolean isAllDead() {
        for (Character member : members) {
            if (member.isAlive()) {
                return false;
            }
        }
        return true;
    }

    private Character getEnemyAtPosition(Point position) {
        for (Character member : members) {
            if (member.isAlive() && member.getPosition().equals(position)) {
                if (!member.getClass().equals(Peasant.class) && !member.getClass().equals(Magician.class)) {
                    return member;
                }
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public List<Character> getMembers() {
        return members;
    }
}
