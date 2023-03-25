
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int GANG_SIZE = 10;
    public static Gang whiteSide;
    public static Gang darkSide;

    public static void main(String[] args) {

        whiteSide = new Gang("Green", GANG_SIZE);
        darkSide = new Gang("Blue", GANG_SIZE);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ConsoleView.view();
            whiteSide.move();
            darkSide.move();

            if (whiteSide.isAllDead() || darkSide.isAllDead()) {
                System.out.println("Game Over!");
                break;
            }

            System.out.println("Do you want to continue? (y/n): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
                System.out.println("Exiting the game...");
                break;
            }

        }

        scanner.close();

        if (whiteSide.isAllDead() && darkSide.isAllDead()) {
            System.out.println("Game Over! Draw");
        } else if (whiteSide.isAllDead()) {
            System.out.println("Game Over! Blue team wins");
        } else {
            System.out.println("Game Over! Green team wins");
        }

        /*
         * if (whiteSide.isAllDead() && !darkSide.isAllDead()) {
         * System.out.println("Blue team wins!");
         * } else if (darkSide.isAllDead() && !whiteSide.isAllDead()) {
         * System.out.println("Green team wins!");
         * } else {
         * System.out.println("It's a tie!");
         * }
         * 
         */

        /*
         * List<Character> heroes1 = new ArrayList<>();
         * List<Character> heroes2 = new ArrayList<>();
         * 
         * for (int i = 0; i < 10; i++) {
         * heroes1.add(new Peasant("Peasant" + i, i, i + 1));
         * heroes1.add(new Bandit("Robber" + i, i + 1, i));
         * heroes1.add(new Sniper("Sniper" + i, i, i));
         * heroes1.add(new Magician("Magician" + i, i + 1, i + 1));
         * heroes2.add(new Spearman("Spearman" + i, i, i + 1));
         * heroes2.add(new Crossbowman("Crossbowman" + i, i + 1, i));
         * heroes2.add(new Monk("Monk" + i, i, i));
         * heroes2.add(new Peasant("Peasant" + i, i + 1, i + 1));
         * }
         */

        /*
         * 
         * List<Character> list1 = new ArrayList<>();
         * List<Character> list2 = new ArrayList<>();
         * 
         * Random random = new Random();
         * 
         * for (int i = 0; i < 10; i++) {
         * switch (random.nextInt(4)) {
         * case 0:
         * list1.add(new Peasant("Peasant " + i, random.nextInt(10),
         * random.nextInt(10)));
         * break;
         * case 1:
         * list1.add(new Bandit("Bandit " + i, random.nextInt(10), random.nextInt(10)));
         * break;
         * case 2:
         * list1.add(new Sniper("Sniper " + i, random.nextInt(10), random.nextInt(10)));
         * break;
         * case 3:
         * list1.add(new Magician("Magician " + i, random.nextInt(10),
         * random.nextInt(10)));
         * break;
         * }
         * }
         * 
         * for (int i = 0; i < 10; i++) {
         * switch (random.nextInt(4)) {
         * case 0:
         * list2.add(new Peasant("Peasant " + i, random.nextInt(10),
         * random.nextInt(10)));
         * break;
         * case 1:
         * list2.add(new Spearman("Spearman " + i, random.nextInt(10),
         * random.nextInt(10)));
         * break;
         * case 2:
         * list2.add(new Crossbowman("Crossbowman " + i, random.nextInt(10),
         * random.nextInt(10)));
         * break;
         * case 3:
         * list2.add(new Monk("Monk " + i, random.nextInt(10), random.nextInt(10)));
         * break;
         * }
         * }
         * 
         * List<Character> allHeroes = new ArrayList<>(list1);
         * allHeroes.addAll(list2);
         * 
         * Collections.shuffle(allHeroes);
         * 
         * for (Character hero : allHeroes) {
         * hero.getInfo();
         * }
         * 
         */

    }
}
