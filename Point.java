import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Point p) {
        return (this.x == p.x && this.y == p.y);
    }
    
    public Point add(Point other) {
        int newX = this.x + other.x;
        int newY = this.y + other.y;
        return new Point(newX, newY);
    }

    public static Point getRandomDirection() {
        Random random = new Random();
        int x = random.nextInt(3) - 1;
        int y = random.nextInt(3) - 1;
        return new Point(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
